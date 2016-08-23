package iface;

import java.util.Random;

/**
 * Created by bswiatek on 07.05.2016.
 */
public class Question implements SharedConstants {
    Random rand = new Random();
    int ask(){
        int prob = (int)(100 * rand.nextDouble());

        if(prob < 30) return NO;
        else if (prob < 60) return YES;
        else if (prob < 70) return MAYBE;
        else if (prob < 85) return LATER;
        else if (prob < 98) return SOON;
        else return NEVER;
    }
}
