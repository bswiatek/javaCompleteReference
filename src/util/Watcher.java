package util;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
    public void update(Observable obj, Object arg){
        System.out.println("Wywołano update, licznik wynosi " + ((Integer)arg).intValue());
    }
}
