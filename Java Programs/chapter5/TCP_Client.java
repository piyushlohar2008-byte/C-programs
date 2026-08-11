import java.io.*;
import java.net.*;

public class TCP_Client {
    public static void main(String[] args) 
    {
        try
        {
            Socket s = new Socket("localhost",1000);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello server");
            String replay = dis.readUTF();
            System.out.println(replay); 
            s.close();
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}