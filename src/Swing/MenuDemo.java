package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo implements ActionListener {

    JLabel jlab;
    JPopupMenu jpu;
    DebugAction setAct;
    DebugAction clearAct;
    DebugAction resumeAct;

    MenuDemo() {
        JFrame jfrm = new JFrame("Prezentacja Menu");

        jfrm.setSize(360, 200);
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

        jfrm.add(jlab, BorderLayout.CENTER);
        jfrm.setJMenuBar(jmb);
        jfrm.setVisible(true);

        jpu = new JPopupMenu();
        JMenuItem jmiCut = new JMenuItem("Wytnij");
        JMenuItem jmiCopy = new JMenuItem("Kopiuj");
        JMenuItem jmiPaste = new JMenuItem("Wklej");
        jpu.add(jmiCut);
        jpu.add(jmiCopy);
        jpu.add(jmiPaste);
        jfrm.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.isPopupTrigger())
                    jpu.show(e.getComponent(), e.getX(), e.getY());
            }
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger())
                    jpu.show(e.getComponent(), e.getX(), e.getY());
            }
        });
        jmiCut.addActionListener(this);
        jmiCopy.addActionListener(this);
        jmiPaste.addActionListener(this);

        ImageIcon setIcon = new ImageIcon("/home/bartek/Pictures/image002.jpg");
        ImageIcon clearIcon = new ImageIcon("/home/bartek/Pictures/image002.jpg");
        ImageIcon resumeIcon = new ImageIcon("/home/bartek/Pictures/image002.jpg");

        setAct = new DebugAction("Ustaw punkt wstrzymania", setIcon, KeyEvent.VK_U,
                KeyEvent.VK_U, "Ustaw punkt wstrzymania");
        clearAct = new DebugAction("Usuń punkt wstrzymania", clearIcon, KeyEvent.VK_S,
                KeyEvent.VK_S, "Usuń punkt wstrzymania");
        resumeAct = new DebugAction("Wznów", resumeIcon, KeyEvent.VK_W,
                KeyEvent.VK_W, "Wznów");
        clearAct.setEnabled(false);

        JButton jbtnSet = new JButton(setAct);
        JButton jbtnClear = new JButton(clearAct);
        JButton jbtnResume = new JButton(resumeAct);

        JToolBar jtb = new JToolBar("Breakpoints");
        jtb.add(jbtnSet);
        jtb.add(jbtnClear);
        jtb.add(jbtnResume);

        jfrm.add(jtb, BorderLayout.NORTH);

        JMenu jmDebug = new JMenu("Uruchamianie");
        JMenuItem jmiSetBP = new JMenuItem(setAct);
        JMenuItem jmiClearBP = new JMenuItem(clearAct);
        JMenuItem jmiResume = new JMenuItem(resumeAct);

        jmDebug.add(jmiSetBP);
        jmDebug.add(jmiClearBP);
        jmDebug.add(jmiResume);
        jmOptions.add(jmDebug);
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

    class DebugAction extends AbstractAction {
        public DebugAction(String name, Icon image, int mnem, int accel, String tTip) {
            super(name, image);
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accel, InputEvent.CTRL_DOWN_MASK));
            putValue(MNEMONIC_KEY, new Integer(mnem));
            putValue(SHORT_DESCRIPTION, tTip);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String comStr = e.getActionCommand();
            jlab.setText("Wybrano " + comStr);

            if(comStr.equals("Ustaw punkt wstrzymania")){
                clearAct.setEnabled(true);
                setAct.setEnabled(false);
            } else if(comStr.equals("Usuń punkt wstrzymania")){
                clearAct.setEnabled(false);
                setAct.setEnabled(true);
            }
        }
    }
}
