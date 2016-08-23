package lang;

public class IsDemo {
    public static void main(String args[]){
        char a[] = {'a', 'b', '5', '?', 'A', ' '};

        for(int i=0; i<a.length; i++){
            if(Character.isDigit(a[i])) System.out.println(a[i] + " to liczba");
            if(Character.isLetter(a[i])) System.out.println(a[i] + " to litera");
            if(Character.isWhitespace(a[i])) System.out.println(a[i] + " to biały znak");
            if(Character.isUpperCase(a[i])) System.out.println(a[i] + " to duża litera");
            if(Character.isLowerCase(a[i])) System.out.println(a[i] + " to mała litera");
        }
    }
}
