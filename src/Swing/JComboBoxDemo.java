package Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

public class JComboBoxDemo extends JApplet {

    JLabel jlab;
    JComboBox<String> jcb;

    String timepieces[] = {"raz", "dwa", "trzy", "cztery"};

    Hashtable<String, String> images = new Hashtable<>();

    public void init() {
        try {
            SwingUtilities.invokeAndWait(
                    new Runnable() {
                        @Override
                        public void run() {
                            makeGUI();
                        }
                    }
            );
        } catch (Exception e) {
            System.out.println("Wyjątek: " +e);
        }
    }

    private void makeGUI() {
        setLayout(new FlowLayout());

        jcb = new JComboBox<>(timepieces);
        add(jcb);

        jcb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) jcb.getSelectedItem();
                jlab.setIcon(new ImageIcon("/home/bartek/Pictures/" + images.get(s) + ".jpg"));
            }
        });

        jlab = new JLabel(new ImageIcon("/home/bartek/Pictures/bp12.jpg"));
        add(jlab);

        images.put("raz", "bp3");
        images.put("dwa", "bp9");
        images.put("trzy", "bp14");
        images.put("cztery", "bp19");
    }
}
