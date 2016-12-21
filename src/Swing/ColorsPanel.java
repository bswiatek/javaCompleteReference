package Swing;

import javax.swing.*;

public class ColorsPanel extends JPanel {
    public ColorsPanel() {
        JButton b1 = new JButton("Czerwony");
        JButton b2 = new JButton("Żółty");
        JButton b3 = new JButton("Niebieski");
        JButton b4 = new JButton("Zielony");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
}
