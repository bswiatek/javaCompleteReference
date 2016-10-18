package javaNIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {

        try(SeekableByteChannel fChan = Files.newByteChannel(
                Paths.get("data/testWrite.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE
        )){
            ByteBuffer mBuf = ByteBuffer.allocate(26);
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
        }
    }
}
