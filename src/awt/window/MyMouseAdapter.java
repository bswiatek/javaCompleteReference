package awt.window;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
    AppWindow appWindow;

    public MyMouseAdapter(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    public void mousePressed(MouseEvent e) {
        appWindow.mouseX = e.getX();
        appWindow.mouseY = e.getY();
        appWindow.mousemsg = "Naciśnięto przycisk myszy w pkt (" + appWindow.mouseX + ", " + appWindow.mouseY + ")";
        appWindow.repaint();
    }
}
