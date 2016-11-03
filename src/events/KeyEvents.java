package events;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEvents extends Applet implements KeyListener{

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

        int key = e.getKeyCode();
        switch (key){
            case KeyEvent.VK_F1:
                msg += "<F1>";
                break;
            case KeyEvent.VK_F2:
                msg += "<F2>";
                break;
            case KeyEvent.VK_F3:
                msg += "<F3>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg += "<PgDn>";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg += "<PgUp>";
                break;
            case KeyEvent.VK_LEFT:
                msg += "<Strzałka w lewo>";
                break;
            case KeyEvent.VK_RIGHT:
                msg += "<Strzałka w prawo>";
                break;
        }

        repaint();
    }

    public void keyReleased(KeyEvent e) {
        showStatus("Klawisz zwolniony");
    }
}
