package awt.Menu;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindowAdapter extends WindowAdapter {
    MenuFrame menuFrame;

    public MyWindowAdapter(MenuFrame MenuFrame) {
        this.menuFrame = MenuFrame;
    }

    public void windowClosing(WindowEvent e) {
        menuFrame.setVisible(false);
    }
}
