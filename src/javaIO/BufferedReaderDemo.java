package javaIO;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException{
        String s = "&copy; jest symbolem praw autorskich, " +
                "natomiast &copy takim symbolem nie jest.\n";
        char buf[] = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);

        java.io.CharArrayReader in = new java.io.CharArrayReader(buf);
        int c;
        boolean marked = false;

        try(BufferedReader f = new BufferedReader(in)){
            while((c = f.read()) != -1){
                switch (c){
                    case '&':
                        if(!marked){
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if(marked){
                            marked = false;
                            System.out.print("(c)");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    case ' ':
                        if(marked){
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    default:
                        if(!marked)
                            System.out.print((char) c);
                        break;
                }
            }
        } catch(IOException e){
            System.out.println("Błąd I/O: " + e);
        }
    }
}
