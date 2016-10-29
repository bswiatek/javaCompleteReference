package applet;

import java.applet.Applet;
import java.awt.*;
import java.net.URL;

public class Bases extends Applet {
    public void init() {
    }

    public void start(){

    }

    public void stop(){

    }

    public void destroy(){

    }

    public void paint(Graphics g){
        String msg;

        URL url = getCodeBase();
        msg = "Katalog bazowy kodu: " + url.toString();
        g.drawString(msg, 10, 20);

        url = getDocumentBase();
        msg = "Katalog bazowy dokumentu: " + url.toString();
        g.drawString(msg, 10, 40);
    }
}
