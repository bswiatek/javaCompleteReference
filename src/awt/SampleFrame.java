package awt;

import java.awt.*;

public class SampleFrame extends Frame {
    SampleFrame(String title){
        super(title);

        MyWindowAdapter adapter = new MyWindowAdapter(this);

        addWindowListener(adapter);
    }

    public void paint(Graphics g){
        g.drawString("To jest okno typu Frame", 10, 40);
    }
}
