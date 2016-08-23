package Stack;

/**
 * Created by bswiatek on 07.05.2016.
 */
interface IntStack {
    void push(int item);
    int pop();

    default void clear(){
        System.out.println("Clear nie zostala zaimplementowana");
    }
}
