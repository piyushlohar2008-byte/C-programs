import java.io.*;
import java.net.*;

public class clientSide {
    public static void main(String[] args) 
    {
        try
        {
            Socket s = new Socket("localhost",1000);
            DataInputStream dis = new DataInputStream(System.in);
            DataInputStream serverIn = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            System.out.print("Enter no : ");
            int no = Integer.parseInt(dis.readLine());
            System.out.print("Enter Positive/Negative : ");
            String ans = dis.readLine();
            dos.writeInt(no);
            dos.writeUTF(ans);
            String get = serverIn.readUTF();
            System.out.println("Server : "+get);
            s.close();
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}