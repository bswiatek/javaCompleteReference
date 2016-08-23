package lang;

public class StringConversions {
    public static void main(String args[]){
        int num = 19648;

        System.out.println("binarnie: " + Integer.toBinaryString(num));
        System.out.println("ósemkowo: " + Integer.toOctalString(num));
        System.out.println("szesnastkowo: " + Integer.toHexString(num));
    }
}
