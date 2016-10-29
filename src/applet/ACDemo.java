package applet;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ACDemo extends Applet {
    public void init() {
    }

    public void start(){
        AppletContext ac = getAppletContext();
        URL url = getCodeBase();

        try{
            ac.showDocument(new URL (url+"Test.html"));
        } catch (MalformedURLException e){
            showStatus("Nie znaleziono adresu URL");
        }
    }

    public void stop(){

    }

    public void destroy(){

    }

    public void paint(Graphics g){

    }
}
