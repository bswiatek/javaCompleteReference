package events;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MousePressedDemo extends Applet {
    public void init(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                showStatus("Naciśnięto przycisk myszy");
            }
        });
    }
}

