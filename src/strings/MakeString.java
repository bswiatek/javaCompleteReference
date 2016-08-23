package strings;

public class MakeString {
    public static void main(String args[]){
        char c[] = {'j', 'a', 'v', 'a'};

        String s1 = new String(c);
        String s2 = new String(s1);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s2.length());
        System.out.println(s1.charAt(2));

        String s = "To jest przykład użycia metody getChars";
        int start = 8;
        int end = 16;
        char buf[] = new char[20];

        s.getChars(start, end, buf, 2);
        System.out.println(buf);
    }
}
