package Swing;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneDemo extends JApplet {

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
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20, 20));
        int b = 0;

        for(int i=0; i<20; i++) {
            for(int j=0; j<20; j++) {
                jp.add(new Button("Przycisk " + b));
                ++b;
            }
        }

        JScrollPane jsp = new JScrollPane(jp);

        add(jsp, BorderLayout.CENTER);
    }
}
