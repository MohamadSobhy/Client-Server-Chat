package server.client.chat;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketServer {

    public static final int PORT = 5000;
    public SocketServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
            Scanner input = new Scanner(is);
            while(input.hasNextLine())
            {
                System.out.println(input.nextLine());
            }
            input.close();
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(SocketClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[])
    {
        new SocketServer();
    }
    
}
