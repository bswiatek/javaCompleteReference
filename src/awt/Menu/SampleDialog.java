package awt.Menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;

public class SampleDialog extends Dialog implements ActionListener {

    SampleDialog(Frame parent, String title) {
        super(parent, title, false);
        setLayout(new FlowLayout());
        setSize(300, 200);

        add(new Label("Naciśnij ten przycisk:"));
        Button b;
        add(b = new Button("Anuluj"));
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public void paint(Graphics g) {
        g.drawString("Ten łańcuch jest wyświetlany w oknie dialogowym", 10, 70);
    }
}
