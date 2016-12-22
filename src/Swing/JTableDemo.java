package Swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.util.Objects;

public class JTableDemo extends JApplet {

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
        String[] colHeads = {"Imię", "Nr wewnętrzny", "Identyfikator"};

        Object[][] data = {
                {"Grzegorz", "4567", "865"},
                {"Krzysztof", "4567", "865"},
                {"Wanda", "4567", "865"},
                {"Melania", "4567", "865"},
                {"Anna", "4567", "865"},
                {"Jan", "4567", "865"},
                {"Mateusz", "4567", "865"},
                {"Celina", "4567", "865"},
                {"Edward", "4567", "865"},
                {"Elżbieta", "4567", "865"},
                {"Janina", "4567", "865"},
                {"Eryk", "4567", "865"},
                {"Hanna", "2222", "111"},
        };

        JTable table = new JTable(data, colHeads);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
