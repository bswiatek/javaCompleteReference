package awt.Menu;

import java.applet.Applet;
import java.awt.*;

public class DialogDemo extends Applet {
    Frame f;

    public void init() {
        f = new MenuFrame("Demo menu.");
        int width = Integer.parseInt(getParameter("width"));
        int height = Integer.parseInt(getParameter("height"));

        setSize(width, height);

        f.setSize(width, height);
        f.setVisible(true);
    }

    public void start() {
        f.setVisible(true);
    }

    public void stop() {
        f.setVisible(false);
    }
}
