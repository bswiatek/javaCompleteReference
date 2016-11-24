package Images;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DoubleBuffer extends Applet {
    int gap = 3;
    int mx, my;
    boolean flicker = true;
    Image buffer = null;
    int w, h;

    public void init() {
        Dimension d = getSize();
        w = d.width;
        h = d.height;
        buffer = createImage(w, h);
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                mx = e.getX();
                my = e.getY();
                flicker = true;
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                mx = e.getX();
                my = e.getY();
                flicker = true;
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        Graphics screengc = null;
        if(!flicker) {
            screengc = g;
            g = buffer.getGraphics();
        }

        g.setColor(Color.blue);
        g.fillRect(0, 0, w, h);

        g.setColor(Color.red);
        for(int i=0; i<w; i+=gap)
            g.drawLine(i, 0, w-i, h);
        for(int i=0; i<w; i+=gap)
            g.drawLine(0, i, w, h-i);

        g.setColor(Color.black);
        g.drawString("Nacisnij przycisk myszy by wymusic podwojne buforowanie", 10, h/2);

        g.setColor(Color.yellow);
        g.fillOval(mx - gap, my - gap, gap*2+1, gap*2+1);

        if(!flicker) {
            screengc.drawImage(buffer, 0, 0, null);
        }
    }

    public void update(Graphics g) {
        paint(g);
    }
}
