package Doc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareNum {
    /**
     * Metoda zwraca kwadrat wartości z num.
     * To jest opis wielowierszowy.
     * @param num Wartość do obliczenia
     * @return num do kwadratu
     */
    public double square(double num) {
        return num * num;
    }

    /**
     * Metoda pobiera liczbę od użytkownika
     * @return Pobrana wartość jako typ double
     * @exception java.io.IOException w przypadku błędu użytkownika
     * @see java.io.IOException
     */
    public double getNumber() throws IOException {
        //utworzenie BR przy użyciu system.in
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(isr);
        String str;

        str = inData.readLine();
        return (new Double(str)).doubleValue();
    }

    /**
     * Przykład użycia metody square().
     * @param args Nieużywany
     * @exception IOException w przypadku błędu
     * @see IOException
     */
    public static void main(String[] args) throws IOException{
        SquareNum ob = new SquareNum();
        double val;

        System.out.println("Wpisz wartość, która zostanie podniesiona do kwadratu: ");
        val = ob.getNumber();
        val = ob.square(val);

        System.out.println("Po podniesieniu do kwadratu: " + val);
    }
}
