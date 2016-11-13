package awt;

import java.applet.Applet;
import java.awt.*;

public class FontInfo extends Applet {
    public void paint(Graphics g) {
        Font f = g.getFont();
        String fontName = f.getName();
        String fontFamily = f.getFamily();
        int fontSize = f.getSize();
        int fontStyle = f.getStyle();

        String msg = "Rodzina: " + fontName;
        msg += ", Czcionka: " + fontFamily;
        msg += ", Rozmiar: " + fontSize;
        msg += ", Styl: ";
        if((fontStyle & Font.BOLD) == Font.BOLD)
            msg += "Pogrubiony";
        if((fontStyle & Font.ITALIC) == Font.ITALIC)
            msg += "Kursywa";
        if((fontStyle & Font.PLAIN) == Font.PLAIN)
            msg += "Prosty";

        g.drawString(msg, 4, 16);
    }
}
