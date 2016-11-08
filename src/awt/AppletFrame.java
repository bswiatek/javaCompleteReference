package awt;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class AppletFrame extends Applet implements MouseListener, MouseMotionListener{
    SampleFrame f;
    String msg = "";
    int mouseX=0, mouseY=0;
    int movX=0, movY=0;

    public void init(){
        f = new SampleFrame("Obsługa zdarzeń myszy");
        f.setSize(300, 200);
        f.setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void start(){
        f.setVisible(true);
    }

    public void stop(){
        f.setVisible(false);
    }

    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
        g.drawString("Kursor myszy w punkcie (" + movX + ", " + movY + ")", 0, 10);
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Wciśnięty.";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        msg = "Zwolniony.";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        mouseX = 0;
        mouseY = 24;
        msg = "Kursor myszy wszedł w obszar okna apletu.";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        mouseX = 0;
        mouseY = 24;
        msg = "Kursor myszy opuścił obszar okna apletu.";
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        movX = e.getX();
        movY = e.getY();
        msg = "*";
        repaint();
    }

    public void mouseMoved(MouseEvent e) {

    }
}
