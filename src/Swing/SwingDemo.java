package Swing;

import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        JFrame jfrm = new JFrame("Prosta aplikacja na bazie biblioteki Swing");

        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Swing to rozbudowane interfejsy GUI.");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
