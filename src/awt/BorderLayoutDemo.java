package awt;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class BorderLayoutDemo extends Applet {
    public void init() {
        setLayout(new BorderLayout());
        add(new Button("Ten przycisk znajdzie się na górze."), BorderLayout.NORTH);
        add(new Label("Tutaj można umieścić komunikat stopki."), BorderLayout.SOUTH);
        add(new Button("Prawy"), BorderLayout.EAST);
        add(new Button("Lewy"), BorderLayout.WEST);

        String msg = "Lorem ipsum dolor sit amet enim. Etiam ullamcorper. Suspendisse a pellentesque dui, non felis. Maecenas malesuada elit lectus felis, \n";

        add(new TextArea(msg), BorderLayout.CENTER);
    }
}
