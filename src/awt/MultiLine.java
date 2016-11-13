package awt;

import java.applet.Applet;
import java.awt.*;

public class MultiLine extends Applet {
    int curX=0, curY=0;

    public void init() {
        Font f = new Font("SansSerif", Font.PLAIN, 12);
        setFont(f);
    }

    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();

        nextLine("To jest pierwszy wiersz.", g);
        nextLine("To jest drugi wiersz.", g);
        sameLine(" Ten jest w tym samym wierszu. ", g);
        sameLine(" Ten także. ", g);
        nextLine("To jest trzeci wiersz", g);
        curX = curY = 0;
    }

    void nextLine(String s, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        curY += fm.getHeight();
        curX = 0;
        g.drawString(s, curX, curY);
        curX = fm.stringWidth(s);
    }

    void sameLine(String s, Graphics g) {
        FontMetrics fm = g.getFontMetrics();

        g.drawString(s, curX, curY);
        curX += fm.stringWidth(s);
    }
}
