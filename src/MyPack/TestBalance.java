package MyPack;


/**
 * Created by bswiatek on 04.05.2016.
 */
public class TestBalance{
    public static void main(String args[]){
        Balance current[] = new Balance[3];

        current[0] = new Balance("Fielding", 123.32);
        current[1] = new Balance("Willhelm Tell", 153.20);
        current[2] = new Balance("Tom Jackson", -12.22);

        for(int i=0; i<3; i++) current[i].show();
    }
}

