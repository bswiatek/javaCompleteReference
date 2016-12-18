package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    JLabel jlab;

    EventDemo() {
        JFrame jfrm = new JFrame("Przykład zdarzenia");
        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(220, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnAlpha = new JButton("Alfa");
        JButton jbtnBeta = new JButton("Beta");

        jbtnAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Naciśnięto pzycisk Alfa.");
            }
        });

        jbtnBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Naciśnięto pzycisk Beta.");
            }
        });

        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);

        jlab = new JLabel("Naciśnij przycisk.");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }
}
