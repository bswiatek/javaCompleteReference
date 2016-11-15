package awt;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo extends Applet implements ActionListener {
    String msg = "";
    Button bList[] = new Button[3];

    public void init() {
        Button yes = new Button("Tak");
        Button no = new Button("Nie");
        Button maybe = new Button("Może");

        bList[0] = (Button) add(yes);
        bList[1] = (Button) add(no);
        bList[2] = (Button) add(maybe);

        for(int i=0; i<3; i++) {
            bList[i].addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent e) {
        for(int i=0; i<3; i++) {
            if(e.getSource() == bList[i]) {
                msg = "Nacisnąłeś przycisk " + bList[i].getLabel();
            }
        }

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 6, 100);
    }
}
