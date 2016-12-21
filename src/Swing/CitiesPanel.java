package Swing;

import javax.swing.*;

public class CitiesPanel extends JPanel {
    public CitiesPanel() {
        JButton b1 = new JButton("Nowy Jork");
        JButton b2 = new JButton("Londyn");
        JButton b3 = new JButton("Kraków");
        JButton b4 = new JButton("Tokio");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
}
