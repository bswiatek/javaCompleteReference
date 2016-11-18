package awt;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class GridBagDemo extends Applet implements ItemListener {
    Checkbox windows, android, solaris, mac;
    String msg = "";

    public void init() {
        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(gbag);

        windows = new Checkbox("Windows", null, true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("MacOS");

        gbc.weightx = 1.0;
        gbc.ipadx = 200;
        gbc.insets = new Insets(4, 4, 0, 0);

        gbc.anchor = GridBagConstraints.NORTHEAST;

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(windows, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(android, gbc);

        gbc.weighty = 1.0;

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(solaris, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(mac, gbc);

        add(windows);
        add(android);
        add(solaris);
        add(mac);

        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Bieżący stan: ";
        g.drawString(msg, 6, 100);
        msg = " Windows: " + windows.getState();
        g.drawString(msg, 6, 120);
        msg = " Android: " + android.getState();
        g.drawString(msg, 6, 140);
        msg = " Solaris: " + solaris.getState();
        g.drawString(msg, 6, 160);
        msg = " Mac OS: " + solaris.getState();
        g.drawString(msg, 6, 180);
    }
}
