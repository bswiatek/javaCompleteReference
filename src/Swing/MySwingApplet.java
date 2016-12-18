package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySwingApplet extends JApplet{
    JLabel jlab;

    JButton jbtnAlpha = new JButton("Alfa");
    JButton jbtnBeta = new JButton("Beta");

    public void init() {
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        } catch (Exception e) {
            System.out.println("Wyjątek " + e);
        }
    }

    private void makeGUI() {
        setLayout(new FlowLayout());

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

        add(jbtnAlpha);
        add(jbtnBeta);

        jlab = new JLabel("Naciśnij przycisk.");
        add(jlab);
    }
}
