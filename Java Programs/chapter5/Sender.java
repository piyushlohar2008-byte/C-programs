import java.io.*;
import java.net.*;

public class Sender {
    public static void main(String[] args) 
    {
        try
        {
            Socket s = new Socket("localhost",1000);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Java is best programming language");
            dos.flush();
            dos.close();
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}