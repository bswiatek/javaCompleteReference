package lang;

public class ShowUserDir {

    public static void main(String args[]){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("java.vm.version"));
    }
}
