package applet;

import java.applet.Applet;
import java.awt.*;

public class StatusWindow extends Applet {

    public void init() {
        setBackground(Color.cyan);
    }

    public void start(){

    }

    public void stop(){

    }

    public void destroy(){

    }

    public void paint(Graphics g){
        g.drawString("Ten tekst jest wyświetlany w oknie apletu.", 10, 20);
        showStatus("Ten tekst jest wyświetlany w oknie stanu.");
    }
}
