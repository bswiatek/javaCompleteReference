package strings;

public class indexOfDemo {
    public static void main(String args[]){
        String s = "Czy być miłym znaczy to samo co być dobrym? " +
                "Czy bycie dobrym jest równoznaczne z byciem miłym?";

        System.out.println(s);
        System.out.println(s.indexOf('b'));
        System.out.println(s.lastIndexOf('b'));
        System.out.println(s.indexOf("być"));
        System.out.println(s.lastIndexOf("być"));
        System.out.println(s.lastIndexOf("bycie", 50));
        System.out.println(s.indexOf("b", 10));
    }
}
