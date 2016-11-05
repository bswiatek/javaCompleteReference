package awt;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyWindowAdapter extends WindowAdapter{
    private SampleFrame sampleFrame;

    MyWindowAdapter(SampleFrame sampleFrame) {
        this.sampleFrame = sampleFrame;
    }

    public void windowClosing(WindowEvent we){
        sampleFrame.setVisible(false);
    }
}
