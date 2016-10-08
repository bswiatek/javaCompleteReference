//Demonstruje użycie klasy FileInputStream
//Program używa instrukcji try-with-resources, zatem wymaga JDK7 lub nowszej

package javaIO;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class CharArrayReader {
    public static void main(String[] args){
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        int length = tmp.length();
        char c[] = new char[length];

        tmp.getChars(0, length, c, 0);
        int i;

        try(java.io.CharArrayReader input1 = new java.io.CharArrayReader(c))
        {
            System.out.println("input1:");
            while((i = input1.read()) != -1){
                System.out.println((char) i);
            }
            System.out.println();
        } catch (IOException e){
            System.out.print("błąd we/wy: " + e);
        }

        try(java.io.CharArrayReader input2 = new java.io.CharArrayReader(c, 0, 5)){
            System.out.println("input2:");
            while((i = input2.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e){
            System.out.println("błąd we/wy: " + e);
        }
    }
}
