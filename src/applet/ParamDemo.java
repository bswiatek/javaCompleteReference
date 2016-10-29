package applet;

import java.applet.Applet;
import java.awt.*;

/*
<appplet code="ParamDemo" width=300 height=80>
<param name=fontName value=Courier>
<param name=fontSize value=14>
<param name=leading value=2>
<param name=accountEnabled value=true>
</applet>
 */

public class ParamDemo extends Applet {
    String fontName;
    int fontSize;
    float leading;
    boolean active;

    public void init() {
    }

    public void start(){
        String param;
        fontName = getParameter("fontName");
        if(fontName == null)
            fontName = "Nie znaleziono";

        param = getParameter("fontSize");
        try{
            if(param != null)
                fontSize = Integer.parseInt(param);
            else fontSize = 0;
        } catch (NumberFormatException e){
            fontSize = -1;
        }

        param = getParameter("leading");
        try{
            if(param != null)
                leading = Float.valueOf(param).floatValue();
            else leading = 0;
        } catch (NumberFormatException e){
            leading = -1;
        }

        param = getParameter("accountEnabled");
        if(param != null){
            active = Boolean.valueOf(param).booleanValue();
        }
    }

    public void stop(){

    }

    public void destroy(){

    }

    public void paint(Graphics g){
        g.drawString("Nazwa czcionki: " + fontName, 0, 10);
        g.drawString("Rozmiar czcionki: " + fontSize, 0, 26);
        g.drawString("Interlinia: " + leading, 0, 42);
        g.drawString("Aktywne konto: " + active, 0, 58);
    }
}
