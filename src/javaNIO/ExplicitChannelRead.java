package javaNIO;

import java.io.IOException;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        try{
            filepath = Paths.get("data/test.txt");
        } catch (InvalidPathException e){
            System.out.println("błąd ścieżki: " + e);
            return;
        }

        try(SeekableByteChannel fChan = Files.newByteChannel(filepath)){
            ByteBuffer mBuf = ByteBuffer.allocate(128);
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
        } catch (IOException e) {
            System.out.println("błąd we/wy: " +e);
        }
    }
}
