/*
 *  NU Educational License - 2017
 */
package networking.socketbased;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Main {
    public static void main(String[] args) throws IOException {
        println("--- Socket Demo ---");
        
        String host = "www.yahoo.com";
        int port = 80; // HTTP protocol
        
        Socket socket = new Socket(host, port);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
       
        String httpRequest = "GET / HTTP/1.1\r\n"
                                + "Host: " + host + "\r\n"
                                + "\r\n\r\n";
        
        println("HTTP Request: \n" + httpRequest);
        bw.write(httpRequest);
        bw.flush();
        
        String line;
        while ((line = br.readLine()) != null) {
            println(line);
        }
        
        socket.close();
        println("--- Done ---");
    }

    private static void println(String msg) {
        System.out.println(msg);
    }
}
