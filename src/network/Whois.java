package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Whois {
    public static void main(String[] args) throws Exception{
        int c;

        try(Socket s = new Socket("whois.internic.net", 43)) {

            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";

            byte buf[] = str.getBytes();
            out.write(buf);

            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }
}
