import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) 
    {
        try
        {
            Socket s = new Socket("localhost",1000);
            DataInputStream dis = new DataInputStream(System.in);
            DataInputStream serverIN = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            System.out.print("Enter no : ");
            int no = Integer.parseInt(dis.readLine());
            System.out.println("Enter Even/Odd : ");
            String ans = dis.readLine();
            dos.writeInt(no);
            dos.writeUTF(ans);
            String replay = serverIN.readUTF();
            System.out.println("Server : "+replay);
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
    }
}