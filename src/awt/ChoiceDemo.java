package awt;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceDemo extends Applet implements ItemListener {
    String msg = "";
    Choice os, browser;

    public void init() {
        os = new Choice();
        browser = new Choice();

        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("MacOS");

        browser.add("Interenet Explorer");
        browser.add("Firefox");
        browser.add("Chrome");
        browser.add("Opera");

        add(os);
        add(browser);

        os.addItemListener(this);
        browser.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Wybrany system: ";
        msg += os.getSelectedItem();
        g.drawString(msg, 6, 80);

        msg = "Wybrana przeglądarka: ";
        msg += browser.getSelectedItem();
        g.drawString(msg, 6, 100);
    }
}
