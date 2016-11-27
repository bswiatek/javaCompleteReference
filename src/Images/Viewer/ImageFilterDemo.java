package Images.Viewer;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ImageFilterDemo extends Applet implements ActionListener {
    Image img;
    PlugInFilter pif;
    Image fimg;
    Image curImg;
    LoadedImage lim;
    Label lab;
    Button reset;

    public void init() {
        setLayout(new BorderLayout());
        Panel p = new Panel();

        add(p, BorderLayout.SOUTH);
        reset = new Button("Przywróć");
        reset.addActionListener(this);
        p.add(reset);
        StringTokenizer st = new StringTokenizer("GrayScale+Invert+Contrast+Blur+Sharpen", "+");

        while (st.hasMoreTokens()) {
            Button b = new Button(st.nextToken());
            b.addActionListener(this);
            p.add(b);
        }

        lab = new Label("");
        add(lab, BorderLayout.NORTH);

        img = getImage(getDocumentBase(), "/home/bartek/Pictures/bp20.jpg");
        lim = new LoadedImage(img);
        add(lim, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String a = "";

        try {
            a = e.getActionCommand();
            if (a.equals("Przywróć")) {
                lim.set(img);
                lab.setText("Obraz oryginalny");
            } else {
                pif = (PlugInFilter) Class.forName("Images.Viewer." + a).newInstance();
                fimg = pif.filter(this, img);
                lim.set(fimg);
                lab.setText("Obraz przefiltrowany: " + a);
            }

            repaint();
        }catch (ClassNotFoundException e1) {
            lab.setText("Nie znaleziono klasy " +a);
            lim.set(img);
            repaint();
        } catch (InstantiationException e1) {
            lab.setText("Nie powiodło się tworzneie egzemplarza klasy " + a);
        } catch (IllegalAccessException e1) {
            lab.setText("Brak dostępu: " + a);
        }
    }
}
