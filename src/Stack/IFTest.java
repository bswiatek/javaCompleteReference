package Stack;


/**
 * Created by bswiatek on 07.05.2016.
 */
public class IFTest {
    public static void main(String args[]){
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        for(int i=0; i<5; i++) mystack1.push(i);
        for(int i=0; i<8; i++) mystack2.push(i);

        System.out.println("Stos mystack1:");
        for(int i=0; i<5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stos mystack2:");
        for(int i=0; i<81; i++)
            System.out.println(mystack2.pop());
    }
}