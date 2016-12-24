package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo implements ActionListener {

    JLabel jlab;

    MenuDemo() {
        JFrame jfrm = new JFrame("Prezentacja Menu");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlab = new JLabel();
        JMenuBar jmb = new JMenuBar();

        JMenu jmFile = new JMenu("Plik");
        JMenuItem jmiOpen = new JMenuItem("Otwórz");
        JMenuItem jmiClose = new JMenuItem("Zamknij");
        JMenuItem jmiSave = new JMenuItem("Zapisz");
        JMenuItem jmiExit = new JMenuItem("Zakończ");
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);

        JMenu jmOptions = new JMenu("Opcje");

        JMenu jmColors = new JMenu("Kolory");
        JMenuItem jmiRed = new JMenuItem("Czerwony");
        JMenuItem jmiGreen = new JMenuItem("Zielony");
        JMenuItem jmiBlue = new JMenuItem("Niebieski");
        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);

        JMenu jmPriority = new JMenu("Priorytet");
        JMenuItem jmiHigh = new JMenuItem("Wysoki");
        JMenuItem jmiLow = new JMenuItem("Niski");
        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);
        jmOptions.add(jmPriority);


        JMenuItem jmiReset = new JMenuItem("Resetuj");
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);

        jmb.add(jmOptions);

        JMenu jmHelp = new JMenu("Pomoc");
        JMenuItem jmiAbout = new JMenuItem("O programie");
        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
        jmiAbout.addActionListener(this);

        jfrm.add(jlab);
        jfrm.setJMenuBar(jmb);
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comStr = e.getActionCommand();

        if(comStr.equals("Zakończ")) System.exit(0);

        jlab.setText("Wybrano " + comStr);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuDemo();
            }
        });
    }
}
