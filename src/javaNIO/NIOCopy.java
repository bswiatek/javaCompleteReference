package javaNIO;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {

        if(args.length != 2){
            System.out.println("Sposób użycia: NIOCopy źródło cel");
            return;
        }
        try{
            Path source = Paths.get(args[0]);
            Path target = Paths.get(args[1]);

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e){
            System.out.println("błąd ścieżki: " + e);
        } catch (IOException e) {
            System.out.println("błąd we/wy: " +e);
        }
    }
}
