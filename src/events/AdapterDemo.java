package events;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class AdapterDemo extends Applet {
    public void init(){
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
}

class MyMouseAdapter extends MouseAdapter{
    AdapterDemo adapterDemo;
    public MyMouseAdapter(AdapterDemo adapterDemo){
        this.adapterDemo = adapterDemo;
    }
    public void mouseClicked(MouseEvent me){
        adapterDemo.showStatus("Kliknięto przycisk myszy");
    }
}

class MyMouseMotionAdapter extends MouseMotionAdapter{
    AdapterDemo adapterDemo;
    public MyMouseMotionAdapter(AdapterDemo adapterDemo){
        this.adapterDemo = adapterDemo;
    }

    public void mouseDragged(MouseEvent me){
        adapterDemo.showStatus("Przeciągnięto kursor myszy");
    }
}