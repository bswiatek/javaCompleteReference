package Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListDemo extends JApplet {

    JList<String> jlist;
    JLabel jlab;
    JScrollPane jscrlp;

    String Cities[] = {"Nowy Jork", "Chicago", "Houston",
            "Kraków", "Warszawa", "Gdańsk",
            "Londyn", "Paryż", "Berlin",
            "Hongkong", "Tokio", "Sydney"};

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

        jlist = new JList<>(Cities);
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jscrlp = new JScrollPane(jlist);
        jscrlp.setPreferredSize(new Dimension(120, 90));
        jlab = new JLabel("Wybierz miasto");

        jlist.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int idx = jlist.getSelectedIndex();
                if(idx != -1)
                    jlab.setText("Bieżący wybór: " + Cities[idx]);
                else
                    jlab.setText("Wybierz miasto");
            }
        });

        add(jscrlp);
        add(jlab);
    }
}
