package awt.TextLayout;

import java.awt.event.*;

public class MyMouseAdapter extends MouseAdapter {
    TextLayout tl;

    public MyMouseAdapter(TextLayout tl) {
        this.tl = tl;
    }
    public void mouseClicked(MouseEvent me) {
        tl.align = (tl.align +1) % 4;
        tl.repaint();
    }
}
