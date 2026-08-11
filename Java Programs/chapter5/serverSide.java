import java.io.*;
import java.net.*;

public class serverSide {
    public static void main(String[] args) 
    {
        try
        {
            ServerSocket ss = new ServerSocket(1000);
            System.out.println("Response...");
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            int num = dis.readInt();
            String clientAns = dis.readUTF();
            String result;
            if(num > 0) result = "Positive";
            else result = "Negative";

            if(result.equals(clientAns)) dos.writeUTF("Correct");
            else dos.writeUTF("Wrong");
            ss.close();
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}