package awt;

import java.applet.Applet;
import java.awt.*;

public class AppletFrame extends Applet {
    Frame f;
    public void init(){
        f = new SampleFrame("Okno typu frame");
        f.setSize(250, 250);
        f.setVisible(true);
    }

    public void start(){
        f.setVisible(true);
    }

    public void stop(){
        f.setVisible(false);
    }

    public void paint(Graphics g){
        g.drawString("To jest okno apletu", 10, 20);
    }
}
