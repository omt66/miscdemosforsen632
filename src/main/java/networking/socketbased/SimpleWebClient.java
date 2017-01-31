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
 * Very very simple web client! Not recommended to be used, just for
 * demo purposes (for socket)!
 * 
 * Use OkHttp instead! (or similar good library)
 * 
 * @author Ogun otigli@gmail.com
 */
public class SimpleWebClient {
    Socket socket;
    
    public String getInfo(String host, int port) throws IOException {
        socket = new Socket(host, port);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
       
        String httpRequest = "GET / HTTP/1.1\r\n"
                                + "Host: " + host + "\r\n"
                                + "\r\n\r\n";
        
        bw.write(httpRequest);
        bw.flush();
        
        String fullInfo = "";
        String line;
        while ((line = br.readLine()) != null) {
            fullInfo += line;
        }
        
        socket.close();
        
        return fullInfo;        
    }
}
