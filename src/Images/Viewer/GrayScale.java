package Images.Viewer;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.*;

public class GrayScale extends RGBImageFilter implements PlugInFilter {
    @Override
    public Image filter(Applet a, Image in) {
        return a.createImage(new FilteredImageSource(in.getSource(), this));
    }

    @Override
    public int filterRGB(int x, int y, int rgb) {
        int r = (rgb >> 16) & 0xff;
        int g = (rgb >> 8) & 0xff;
        int b = rgb & 0xff;
        int k = (int) (.56 * g + .33 * r + .11 * b);

        return (0xff000000 | k << 16 | k << 8 | k);
    }
}
