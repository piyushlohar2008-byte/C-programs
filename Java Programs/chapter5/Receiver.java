import java.io.*;
import java.net.*;

public class Receiver {
    public static void main(String[] args) 
    {
        try
        {
            ServerSocket ss = new ServerSocket(1000);
            System.out.println("Server waiting...");
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String message = dis.readUTF();
            System.out.println(message);
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }   
    }
}