
package server.client.chat;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketClient {
    
    public SocketClient ()
    {
        try{
        Socket socket = new Socket("127.0.0.1",SocketServer.PORT);  //connect to Server ( Local Host ) ..
        socket.setSoTimeout(5000);   //try to get connection for 5 seconds .. 
        OutputStream os = socket.getOutputStream();
        PrintWriter p = new PrintWriter(os);
        p.println("Hello Server .. ");
        p.flush();
        p.close();
        os.close();
        socket.close();
        }catch(Exception e)
        {
            
        }
        
    }
    public static void main(String args[])
    {
        new SocketClient();
    }
    
}
