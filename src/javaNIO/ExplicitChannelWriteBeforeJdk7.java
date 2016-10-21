package javaNIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWriteBeforeJdk7 {
    public static void main(String[] args) {
        FileOutputStream fOut = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;

        try{
            fOut = new FileOutputStream("data/text.txt");
            fChan = fOut.getChannel();
            mBuf = ByteBuffer.allocate(26);
            for(int h=0; h<3; h++){
                for(int i=0; i<26; i++){
                    mBuf.put((byte)('a' + i));
                }
                mBuf.rewind();
                fChan.write(mBuf);
                mBuf.rewind();
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
