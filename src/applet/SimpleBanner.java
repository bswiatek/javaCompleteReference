package applet;

import java.applet.Applet;
import java.awt.*;

public class SimpleBanner extends Applet implements Runnable{
    String msg = "Prosty, przewijany pasek reklamowy.";
    Thread t = null;
    int state;
    boolean stopFlag;

    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    public void start(){
        t = new Thread( this);
        stopFlag = false;
        t.start();
    }

    public void run(){
        for( ; ;){
            try{
                repaint();
                Thread.sleep(250);
                if(stopFlag){
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop(){
        stopFlag = true;
        t = null;
    }

    public void destroy(){

    }

    public void paint(Graphics g){
        char ch;

        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;

        g.drawString(msg, 50, 30);
    }
}
