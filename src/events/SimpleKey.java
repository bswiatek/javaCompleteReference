package events;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import static javafx.scene.input.KeyCode.Y;

public class SimpleKey extends Applet implements KeyListener{

    String msg = "";
    int X = 10, Y = 20;

    public void init() {
        addKeyListener(this);
    }

    public void paint(Graphics g){
        g.drawString(msg, X, Y);
    }

    public void keyTyped(KeyEvent e) {
        msg += e.getKeyChar();
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        showStatus("Klawisz wciśnięty");
    }

    public void keyReleased(KeyEvent e) {
        showStatus("Klawisz zwolniony");
    }
}
