package javaNIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChannelReadBeforeJdk7 {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        long fSize;
        MappedByteBuffer mBuf;

        try{
            fIn = new FileInputStream("data/test.txt");
            fChan = fIn.getChannel();
            fSize = fChan.size();
            mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            for(int i=0; i < fSize; i++)
                System.out.print((char)mBuf.get());
            System.out.println();
        } catch (InvalidPathException e){
            System.out.println("błąd ścieżki: " + e);
        } catch (IOException e) {
            System.out.println("błąd we/wy: " +e);
        } finally {
            try{
                if(fChan != null) fChan.close();
            } catch (IOException e){
                System.out.println("Błąd zamykania kanału");
            }
            try{
                if(fIn != null) fIn.close();;
            }catch (IOException e){
                System.out.println("Błąd zamykania pliku");
            }
        }
    }
}
