import java.io.*;
import java.net.*;

public class senderMessage {
    public static void main(String[] args) 
    {
        try
        {
            Socket s = new Socket("localhost",1000);
            DataInputStream dis = new DataInputStream(System.in);
            DataInputStream server = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            System.out.print("Enter no : ");
            int num = Integer.parseInt(dis.readLine());
            System.out.print("Enter Greater/Smaller : ");
            String answer = dis.readLine();
            dos.writeInt(num);
            dos.writeUTF(answer);
            String msg = server.readUTF();
            System.out.println("Received: "+msg);
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}