import java.io.*;
import java.net.*;

public class receiverMessage {
    public static void main(String[] args) 
    {
        try
        {
            ServerSocket ss = new ServerSocket(1000);
            System.out.println("Waiting for client message");
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            int no = dis.readInt();
            String recieved_ans = dis.readUTF();
            String store;
            if(no >= 10)
            {
                store = "Greater";
            } 
            else
            {
                store = "Smaller";
            }
            if(store.equals(recieved_ans)) 
            {
                dos.writeUTF("Greatest number");  
            }
            else
            {
                dos.writeUTF("Smallest number");
            }
            ss.close();
        } 
        catch(Exception e)
        {
            System.out.println(e);
        }   
    }
}