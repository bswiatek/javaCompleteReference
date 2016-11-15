package awt;

import java.applet.Applet;
import java.awt.*;

public class LabelDemo extends Applet {
    public void init() {
        Label one = new Label("Jeden");
        Label two = new Label("Dwa");
        Label three = new Label("Trzy");

        add(one);
        add(two);
        add(three);
    }
}
