package inputOutput;

public class NativeDemo {
    int i;
    public static void main(String args[]){
        NativeDemo ob = new NativeDemo();

        ob.i = 10;
        System.out.println("ob.i przed metodą native:" + ob.i);
        ob.test();
        System.out.println("ob.i po metodzie native:" + ob.i);
    }
    public native void test();

    static {
        System.loadLibrary("NativeDemo");
    }
}
