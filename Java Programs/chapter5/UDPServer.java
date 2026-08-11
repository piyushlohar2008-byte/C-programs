import java.net.*;

public class UDPServer {
    public static void main(String[] args) 
    {
        try
        {
            DatagramSocket ds = new DatagramSocket(1000);
            byte[] b = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b, b.length);
            ds.receive(dp);
            String msg = new String(dp.getData(),0,dp.getLength());
            System.out.println(msg);
            ds.close();
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}