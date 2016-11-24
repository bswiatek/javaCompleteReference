package Images;

import java.applet.Applet;
import java.awt.*;

public class SimpleImageLoad extends Applet {
    Image img;

    public void init() {
        img = getImage(getDocumentBase(), "/home/bartek/Pictures/bp3.jpg");
    }

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, this);
    }
}
