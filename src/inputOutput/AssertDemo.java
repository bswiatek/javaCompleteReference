package inputOutput;

public class AssertDemo {
    static int val = 3;

    static int getnum(){
        return val--;
    }

    public static void main(String args[]){
        int n;
        for(int i=0; i<10; i++){
            n = getnum();

            assert n > 0 : "n nie jest dodatnie";
            System.out.println("n wynosi "+n);
        }
    }
}
