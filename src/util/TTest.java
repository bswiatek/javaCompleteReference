package util;

import java.util.Timer;
import java.util.TimerTask;

public class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();

        myTimer.schedule(myTask, 1000, 500);

        try{
            Thread.sleep(5000);
        }catch (InterruptedException exc){}

        myTimer.cancel();
    }
}
