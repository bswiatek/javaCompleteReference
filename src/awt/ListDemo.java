package awt;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListDemo extends Applet implements ItemListener {
    String msg = "";
    List os, browser;

    public void init() {
        os = new List(4, true);
        browser = new List(3, false);

        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("MacOS");

        browser.add("Interenet Explorer");
        browser.add("Firefox");
        browser.add("Chrome");
        browser.add("Opera");
        browser.select(1);
        add(os);
        add(browser);

        os.addItemListener(this);
        browser.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        int idx[];
        msg = "Wybrany system: ";
        idx = os.getSelectedIndexes();
        for(int i=0; i<idx.length; i++)
            msg += os.getItem(idx[i]) + " ";
        g.drawString(msg, 6, 100);

        msg = "Wybrana przeglądarka: ";
        msg += browser.getSelectedItem();
        g.drawString(msg, 6, 120);
    }
}
