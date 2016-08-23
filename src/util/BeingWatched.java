package util;

import java.util.Observable;
import java.util.Observer;

public class BeingWatched extends Observable {
    void counter(int period){
        for( ; period >=0; period--){
            setChanged();
            notifyObservers(new Integer(period));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                System.out.println("Przerwano wstrzymanie");
            }
        }
    }
}
