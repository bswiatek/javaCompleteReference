package javaNIO;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try(OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("data/test.txt")))){
            for(int i=0; i<26; i++)
                fout.write((byte)('A' + i));
        } catch (InvalidPathException e){
            System.out.println("błąd ścieżki: " + e);
        } catch (IOException e) {
            System.out.println("błąd we/wy: " +e);
        }
    }
}
