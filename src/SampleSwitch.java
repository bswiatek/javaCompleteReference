/**
 * Created by bswiatek on 16.04.2016.
 */
public class SampleSwitch {
    public static void main(String args[])
    {
        for(int i=0; i<12; i++)
        {
            switch(i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i jest mniejsze od 5");
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i jest mniejsze od 10");
                    break;
                default:
                    System.out.println("i wynosi 10 lub więcej");
            }
        }
    }
}
