package Stack;


/**
 * Created by bswiatek on 07.05.2016.
 */
public class IFTest3 {
    public static void main(String args[]){
        IntStack mystack;
        DynStack mystack1 = new DynStack(5);
        FixedStack mystack2 = new FixedStack(8);

        mystack = mystack1;
        for(int i=0; i<12; i++) mystack.push(i);

        mystack = mystack2;
        for(int i=0; i<10; i++) mystack.push(i);

        mystack = mystack1;
        System.out.println("Stos dynamiczny:");
        for(int i=0; i<12; i++)
            System.out.println(mystack.pop());

        mystack = mystack2;
        System.out.println("Stos stały:");
        for(int i=0; i<10; i++)
            System.out.println(mystack.pop());
    }
}