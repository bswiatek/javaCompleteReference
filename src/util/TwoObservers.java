package util;

public class TwoObservers {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher observing = new Watcher();
        Watcher2 observing2 = new Watcher2();

        observed.addObserver(observing);
        observed.addObserver(observing2);

        observed.counter(10);
    }
}
