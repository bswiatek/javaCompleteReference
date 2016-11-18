package awt;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FlowLayoutDemo extends Applet implements ItemListener {
    String msg = "";
    private Checkbox windows, android, solaris, mac;

    public void init() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        windows = new Checkbox("Windows", null, true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("MacOS");

        add(windows);
        add(android);
        add(solaris);
        add(mac);

        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Bieżący stan: ";
        g.drawString(msg, 6, 80);
        msg = "Windows: " + windows.getState();
        g.drawString(msg, 6, 100);
        msg = "Android: " + android.getState();
        g.drawString(msg, 6, 120);
        msg = "Solaris: " + solaris.getState();
        g.drawString(msg, 6, 140);
        msg = "MacOS: " + mac.getState();
        g.drawString(msg, 6, 160);
    }
}
