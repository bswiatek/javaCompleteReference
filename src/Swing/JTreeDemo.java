package Swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

public class JTreeDemo extends JApplet {

    JLabel jlab;
    JTree tree;

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

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Opcje");

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("A3");
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");

        top.add(a);
        a.add(a1);
        a.add(a2);
        a.add(a3);
        top.add(b);
        b.add(b1);
        b.add(b2);
        b.add(b3);

        tree = new JTree(top);
        JScrollPane jsp = new JScrollPane(tree);
        add(jsp);
        jlab = new JLabel();
        add(jlab, BorderLayout.SOUTH);

        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                jlab.setText("Wybrano " + e.getPath());
            }
        });
    }
}
