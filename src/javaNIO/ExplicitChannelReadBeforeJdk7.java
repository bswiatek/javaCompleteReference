package javaNIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ExplicitChannelReadBeforeJdk7 {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        int count;

        try{
            fIn = new FileInputStream("data/test.txt");
            fChan = fIn.getChannel();
            mBuf = ByteBuffer.allocate(128);
            do{
                count = fChan.read(mBuf);
                if(count != -1){
                    mBuf.rewind();
                    for(int i=0; i < count; i++){
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);
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
