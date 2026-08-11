import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) 
    {
        try
        {
            ServerSocket ss = new ServerSocket(1000);
            System.out.println("Waiting...");
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            int num = dis.readInt();
            String client = dis.readUTF();
            String result;
            if(num % 2 == 0) result = "Even";
            else result = "Odd";

            if(result.equals(client)) dos.writeUTF("Correct answer");
            else dos.writeUTF("Wrong answer");
            ss.close();
        }
        catch(Exception e)
        {

        }    
    }
}