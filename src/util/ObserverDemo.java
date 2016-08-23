package util;

import java.util.Observable;

public class ObserverDemo {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher observing = new Watcher();

        observed.addObserver(observing);

        observed.counter(10);
    }
}
