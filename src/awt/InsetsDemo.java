package awt;

import java.applet.Applet;
import java.awt.*;

public class InsetsDemo extends Applet {
    public void init() {
        setBackground(Color.cyan);

        setLayout(new BorderLayout());
        add(new Button("Ten przycisk znajdzie się na górze."), BorderLayout.NORTH);
        add(new Label("Tutaj można umieścić komunikat stopki."), BorderLayout.SOUTH);
        add(new Button("Prawy"), BorderLayout.EAST);
        add(new Button("Lewy"), BorderLayout.WEST);

        String msg = "Lorem ipsum dolor sit amet enim. Etiam ullamcorper. Suspendisse a pellentesque dui, non felis. Maecenas malesuada elit lectus felis, \n";

        add(new TextArea(msg), BorderLayout.CENTER);
    }

    public Insets getInsets() {
        return new Insets(10, 10, 10, 10);
    }
}
