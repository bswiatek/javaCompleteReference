package inputOutput;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) throws IOException{
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("data/test.dat")))
        {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e){
            System.out.println("Nie mozna otworzyc pliku wyjściowego");
            return;
        } catch (IOException e){
            System.out.println("Błąd we/wy: " +e);
        }

        try(DataInputStream din = new DataInputStream(new FileInputStream("data/test.dat")))
        {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Oto wczytane wartości: " + d + " " + i + " " + b);
        } catch (FileNotFoundException e){
            System.out.println("Nie mozna otworzyc pliku wyjściowego");
            return;
        } catch (IOException e){
            System.out.println("Błąd we/wy: " +e);
        }
    }
}
