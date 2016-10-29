package applet;

import java.applet.Applet;
import java.awt.*;

public class Sample extends Applet {
    String msg;

    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "init() --";
    }

    public void start(){
        msg += " start() --";
    }

    public void stop(){

    }

    public void destroy(){

    }

    public void paint(Graphics g){
        msg += " paint().";
        g.drawString(msg, 10, 30);
    }
}
