package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

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
        jmFile.setMnemonic(KeyEvent.VK_P);

        JMenuItem jmiOpen = new JMenuItem("Otwórz", KeyEvent.VK_O);
        jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiClose = new JMenuItem("Zamknij", KeyEvent.VK_M);
        jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiSave = new JMenuItem("Zapisz", KeyEvent.VK_Z);
        jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiExit = new JMenuItem("Zakończ", KeyEvent.VK_K);
        jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);

        JMenu jmOptions = new JMenu("Opcje");

        JMenu jmColors = new JMenu("Kolory");
        JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Czerwony");
        JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Zielony");
        JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Niebieski");
        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);

        JMenu jmPriority = new JMenu("Priorytet");
        JRadioButtonMenuItem jmiHigh = new JRadioButtonMenuItem("Wysoki");
        JRadioButtonMenuItem jmiLow = new JRadioButtonMenuItem("Niski");
        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);
        jmOptions.add(jmPriority);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jmiHigh);
        bg.add(jmiLow);

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
