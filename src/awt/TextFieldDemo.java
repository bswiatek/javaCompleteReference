package awt;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TextFieldDemo extends Applet implements ActionListener {
    TextField name, pass;

    public void init() {
        Label namep = new Label("Nazwisko: ", Label.RIGHT);
        Label passp = new Label("Hasło: ", Label.RIGHT);
        name = new TextField(12);
        pass = new TextField(8);
        pass.setEchoChar('?');

        add(namep);
        add(name);
        add(passp);
        add(pass);

        name.addActionListener(this);
        pass.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString("Nazwisko: " + name.getText(), 6, 60);
        g.drawString("Zaznaczony tekst w polu nazwiska: " + name.getSelectedText(), 6, 80);
        g.drawString("Hasło: " + pass.getText(), 6, 100);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
