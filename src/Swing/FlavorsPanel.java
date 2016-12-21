package Swing;

import javax.swing.*;

public class FlavorsPanel extends JPanel {
    public FlavorsPanel() {
        JButton b1 = new JButton("Waniliowy");
        JButton b2 = new JButton("Czekoladowy");
        JButton b3 = new JButton("Truskawkowy");
        add(b1);
        add(b2);
        add(b3);
    }
}
