package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JToggleButtonDemo extends JApplet {
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

        JLabel jlab = new JLabel("Przycisk jest wyłączony");
        JToggleButton jtbn = new JToggleButton("Włączony / Wyłączony");

        add(jlab);
        add(jtbn);
        jtbn.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(jtbn.isSelected())
                    jlab.setText("Przycisk jest włączony");
                else
                    jlab.setText("Przycisk jest wyłączony");
            }
        });
    }
}
