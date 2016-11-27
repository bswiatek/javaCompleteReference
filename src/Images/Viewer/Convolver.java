package Images.Viewer;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.MemoryImageSource;
import java.util.Hashtable;

abstract class Convolver implements ImageConsumer, PlugInFilter {
    int width, height;
    int imgpixels[], newimgpixels[];
    boolean imageReady = false;

    abstract void convolve();

    @Override
    public Image filter(Applet a, Image in) {
        imageReady = false;
        in.getSource().startProduction(this);

        waitForImage();
        newimgpixels = new int[width*height];

        try {
            convolve();
        } catch (Exception e) {
            System.out.println("Filtrowanie konwolucyjne nie powiodło się: " + e);
            e.printStackTrace();
        }

        return a.createImage(new MemoryImageSource(width, height, newimgpixels, 0, width));
    }

    synchronized void waitForImage() {
        try {
            while (!imageReady) wait();
        } catch (InterruptedException e) {
            System.out.println("Przerwano");
        }
    }

    @Override
    public void setDimensions(int x, int y) {
        width = x;
        height = y;
        imgpixels = new int[x*y];
    }

    @Override
    public void setProperties(Hashtable<?, ?> props) {
    }

    @Override
    public void setColorModel(ColorModel model) {
    }

    @Override
    public void setHints(int hintflags) {
    }


    @Override
    public void setPixels(int x1, int y1, int w, int h, ColorModel model, byte[] pixels, int off, int scansize) {
        int pix, x, y, x2, y2, sx, sy;

        x2 = x1+w;
        y2 = y1+h;
        sy = off;
        for(y=y1; y<y2; y++) {
            sx = sy;
            for(x=x1; x<x2; x++) {
                pix = model.getRGB(pixels[sx++]);
                if((pix & 0xff000000) ==0)
                    pix = 0x00ffffff;
                imgpixels[y*width+x] = pix;
            }
            sy += scansize;
        }
    }

    @Override
    public void setPixels(int x1, int y1, int w, int h, ColorModel model, int[] pixels, int off, int scansize) {
        int pix, x, y, x2, y2, sx, sy;

        x2 = x1+w;
        y2 = y1+h;
        sy = off;
        for(y=y1; y<y2; y++) {
            sx = sy;
            for(x=x1; x<x2; x++) {
                pix = model.getRGB(pixels[sx++]);
                if((pix & 0xff000000) ==0)
                    pix = 0x00ffffff;
                imgpixels[y*width+x] = pix;
            }
            sy += scansize;
        }
    }

    @Override
    public synchronized void imageComplete(int status) {
        imageReady = true;
        notifyAll();
    }
}
