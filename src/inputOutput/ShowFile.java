package inputOutput;

import java.io.*;

public class ShowFile {
    public static void main(String args[])
    {
        int i;

        if(args.length != 1)
        {
            System.out.println("odpalenie: ShowFile nazwa-pliku");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        } catch (IOException e){
            System.out.println("Błąd odczytu");
        }

    }
}
