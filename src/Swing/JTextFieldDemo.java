package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo extends JApplet {
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

        JTextField jtf = new JTextField(15);
        add(jtf);
        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showStatus(jtf.getText());
            }
        });
    }
}
