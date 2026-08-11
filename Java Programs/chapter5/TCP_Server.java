import java.io.*;
import java.net.*;

public class TCP_Server {
    public static void main(String[] args) 
    {
        try
        {
            ServerSocket ss = new ServerSocket(1000);
            System.out.println("Waiting for replay...");
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            String save = dis.readUTF();
            String m = "Message received";
            dos.writeUTF(m);
            System.out.println(save);
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}