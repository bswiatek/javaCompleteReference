package iface;

import java.util.Random;

/**
 * Created by bswiatek on 01.06.2016.
 */
public class Question2 {

    Random rand = new Random();

    Answers ask(){
        int prob = (int)(100 * rand.nextDouble());

        if(prob < 30) return Answers.NO;
        else if (prob < 60) return Answers.YES;
        else if (prob < 70) return Answers.MAYBE;
        else if (prob < 85) return Answers.LATER;
        else if (prob < 98) return Answers.SOON;
        else return Answers.NEVER;
    }

}
