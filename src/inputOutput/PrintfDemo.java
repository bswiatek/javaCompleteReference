package inputOutput;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.printf("Różne formaty liczb całkowitych: ");
        System.out.printf("%d %(d %+d %05d \n", 3, -3, 3, 3);

        System.out.println();

        System.out.printf("Domyślny format licz zmiennoprzecinkowych: %f \n", 1234567.123);
        System.out.printf("Liczba zmiennoprzecinkowa z dodatkowymi przecinkami: %,f \n", 1234567.123);
        System.out.printf("Domyślny format zmiennoprzecinkwych ujemnych: %,f \n", -1234567.123);
        System.out.printf("Zmiennoprzecinkwe ujemne - inny format: %,(f \n", -1234567.123);

        System.out.println();

        System.out.printf("Wyrównanie wartości dodatnich i ujemnych: \n");
        System.out.printf("% ,.2f\n% ,.2f\n", 1234567.123, -1234567.123);
    }
}
