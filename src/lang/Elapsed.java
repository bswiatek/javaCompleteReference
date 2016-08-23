package lang;

import thread.Synch;

public class Elapsed {
    public static void main(String args[]){

        long start, end;
        System.out.println("Czas wykonywania pętli");

        start = System.currentTimeMillis();
        for(int i=0; i< 1000000000; i++);
        end = System.currentTimeMillis();

        System.out.println("Czas: " + (end-start));
    }
}
