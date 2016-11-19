package awt.Menu;

import java.awt.*;

public class MenuFrame extends Frame {
    String msg = "";
    CheckboxMenuItem debug, test;

    MenuFrame(String title) {
        super(title);

        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);

        Menu file = new Menu("Plik");
        MenuItem item1, item2, item3, item4, item5;
        file.add(item1 = new MenuItem("Nowy..."));
        file.add(item2 = new MenuItem("Otwórz..."));
        file.add(item3 = new MenuItem("Zamknij"));
        file.add(item4 = new MenuItem("-"));
        file.add(item5 = new MenuItem("Zakończ..."));
        mbar.add(file);

        Menu edit = new Menu("Edycja");
        MenuItem item6, item7, item8, item9;
        edit.add(item6 = new MenuItem("Wytnij"));
        edit.add(item7 = new MenuItem("Kopiuj"));
        edit.add(item8 = new MenuItem("Wklej"));
        edit.add(item9 = new MenuItem("-"));

        Menu sub = new Menu("Specjalne");
        MenuItem item10, item11, item12;
        sub.add(item10 = new MenuItem("Pierwszy"));
        sub.add(item11 = new MenuItem("Drugi"));
        sub.add(item12 = new MenuItem("Trzeci"));
        edit.add(sub);

        debug = new CheckboxMenuItem("Tryb usuwania błędów");
        edit.add(debug);
        test = new CheckboxMenuItem("Tryb testowania");
        edit.add(test);

        mbar.add(edit);

        MyMenuHandler handler = new MyMenuHandler(this);
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        item4.addActionListener(handler);
        item5.addActionListener(handler);
        item6.addActionListener(handler);
        item7.addActionListener(handler);
        item8.addActionListener(handler);
        item9.addActionListener(handler);
        item10.addActionListener(handler);
        item11.addActionListener(handler);
        item12.addActionListener(handler);
        debug.addActionListener(handler);
        test.addActionListener(handler);

        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }

    public void paint(Graphics g) {
        g.drawString(msg, 10, 200);

        if(debug.getState())
            g.drawString("Usuwanie błędów jest włączone", 10, 220);
        else
            g.drawString("Usuwanie błędów jest wyłączone", 10, 220);
    }
}
