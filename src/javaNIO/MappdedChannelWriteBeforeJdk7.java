package javaNIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappdedChannelWriteBeforeJdk7 {
    public static void main(String[] args) {
        RandomAccessFile fOut = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;

        try{
            fOut = new RandomAccessFile("data/text.txt", "rw");
            fChan = fOut.getChannel();
            mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for(int i=0; i<26; i++){
                mBuf.put((byte)('A' + i));
            }
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
                if(fOut != null) fOut.close();;
            }catch (IOException e){
                System.out.println("Błąd zamykania pliku");
            }
        }
    }
}
