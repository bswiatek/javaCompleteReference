//Demonstruje użycie klasy FileInputStream
//Program używa instrukcji try-with-resources, zatem wymaga JDK7 lub nowszej

package javaIO;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException{
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte b[] = tmp.getBytes();
        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b,0, 3);

        for(int i=0; i<tmp.length(); i++){
            int c;
            while((c = input1.read()) != -1){
                System.out.println((char) c);
            }
        }

        for(int i=0; i<3; i++){
            int c;
            while((c = input2.read()) != -1){
                System.out.println((char) c);
            }
        }
    }
}
