package awt;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaDemo extends Applet {

    public void init() {
        String val = "Lorem ipsum dolor sit amet enim. Etiam ullamcorper. \n" +
                "Suspendisse a pellentesque dui, non felis. Maecenas malesuada elit lectus felis, \n" +
                "malesuada ultricies. Curabitur et ligula. Ut molestie a, ultricies porta urna. \n" +
                "Vestibulum commodo volutpat a, convallis ac, laoreet enim. Phasellus fermentum in, dolor.\n" +
                " Pellentesque facilisis. Nulla imperdiet sit amet magna. Vestibulum dapibus, \n" +
                "mauris nec malesuada fames ac turpis velit, rhoncus eu, luctus et interdum adipiscing wisi. \n" +
                "Aliquam erat ac ipsum. Integer aliquam purus. Quisque lorem tortor fringilla sed, \n" +
                "vestibulum id, eleifend justo vel bibendum sapien massa ac turpis faucibus orci luctus non, \n" +
                "consectetuer lobortis quis, ";

        TextArea text = new TextArea(val, 10, 30);
        add(text);
    }
}
