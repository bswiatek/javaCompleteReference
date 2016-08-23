package Stack;

/**
 * Created by bswiatek on 07.05.2016.
 */
public class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }

    public void push(int item){
        if(tos == stck.length-1)
            System.out.println("Stos jest pełny.");
        else
            stck[++tos] = item;
    }

    public int pop(){
        if (tos < 0){
            System.out.println("Stos nie zawiera żadnych elementów");
            return 0;
        }
        else
            return stck[tos--];
    }
}
