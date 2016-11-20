package awt.File;

import java.awt.*;

public class FileDialogDemo {
    public static void main(String[] args) {
        Frame f = new SampleFrame("Przykład okna dialogowego plików");
        f.setVisible(true);
        f.setSize(100, 100);

        FileDialog fd = new FileDialog(f, "Okno dialogowe plików");

        fd.setVisible(true);
    }
}
