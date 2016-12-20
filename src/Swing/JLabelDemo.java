package Swing;

import javax.swing.*;

public class JLabelDemo extends JApplet {
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
        ImageIcon ii = new ImageIcon("/home/bartek/Pictures/bp42.jpg");
        JLabel jl = new JLabel("Klepsydra", ii, JLabel.CENTER);
        add(jl);
    }
}
