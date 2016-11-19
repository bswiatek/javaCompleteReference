package awt.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyMenuHandler implements ActionListener, ItemListener {
    MenuFrame menuFrame;

    public MyMenuHandler(MenuFrame menuFrame) {
        this.menuFrame = menuFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = "Wybrałeś opcję ";
        String arg = (String)e.getActionCommand();
        if(arg.equals("Nowy...")) msg += "Nowy.";
        else if (arg.equals("Otwórz...")) msg += "Otwórz.";
        else if (arg.equals("Zamknij")) msg += "Zamknij.";
        else if (arg.equals("Zakończ...")) msg += "Zakończ.";
        else if (arg.equals("Edycja")) msg += "Edycja.";
        else if (arg.equals("Wytnij")) msg += "Wytnij.";
        else if (arg.equals("Kopiuj")) msg += "Kopiuj.";
        else if (arg.equals("Wklej")) msg += "Wklej.";
        else if (arg.equals("Pierwszy")) msg += "Pierwszy.";
        else if (arg.equals("Drugi")) msg += "Drugi.";
        else if (arg.equals("Trzeci")) msg += "Trzeci.";
        else if (arg.equals("Tryb usuwania błędów")) msg += "Tryb usuwania błędów.";
        else if (arg.equals("Tryb testowania")) msg += "Tryb testowania.";

        menuFrame.msg = msg;
        menuFrame.repaint();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        menuFrame.repaint();
    }
}
