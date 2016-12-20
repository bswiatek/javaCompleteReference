package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo extends JApplet implements ActionListener {
    JLabel jlab;

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

        ImageIcon hourglass = new ImageIcon("/home/bartek/Pictures/image002.jpg");
        JButton jb = new JButton(hourglass);
        jb.setActionCommand("klepsydrę");
        jb.addActionListener(this);
        add(jb);

        ImageIcon analog = new ImageIcon("/home/bartek/Pictures/image002.jpg");
        jb = new JButton(analog);
        jb.setActionCommand("zegarek analogowy");
        jb.addActionListener(this);
        add(jb);

        ImageIcon digital = new ImageIcon("/home/bartek/Pictures/image002.jpg");
        jb = new JButton(digital);
        jb.setActionCommand("zegarek cyfrowy");
        jb.addActionListener(this);
        add(jb);

        ImageIcon stopwatch = new ImageIcon("/home/bartek/Pictures/image002.jpg");
        jb = new JButton(stopwatch);
        jb.setActionCommand("stoper");
        jb.addActionListener(this);
        add(jb);

        jlab = new JLabel("Wybierz zegar");
        add(jlab);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jlab.setText("Wybrałeś " + e.getActionCommand());
    }
}
