package awt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class SampleFrame extends Frame implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX=10, mouseY=40;
    int movX=0, movY=0;

    SampleFrame(String title){
        super(title);

        addMouseListener(this);
        addMouseMotionListener(this);
        MyWindowAdapter adapter = new MyWindowAdapter(this);

        addWindowListener(adapter);
    }

    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
        g.drawString("Kursor myszy w punkcie (" + movX + ", " + movY + ")", 10, 40);
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
        mouseX = 10;
        mouseY = 54;
        msg = "Kursor myszy wszedł w obszar okna potomnego.";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        mouseX = 10;
        mouseY = 54;
        msg = "Kursor myszy opuścił obszar okna potomnego.";
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
