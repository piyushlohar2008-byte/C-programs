import java.net.*;

public class UDPClient {
    public static void main(String[] args) 
    {
        try
        {
            DatagramSocket ds = new DatagramSocket();
            String msg = "Hello Server";
            byte[] b = msg.getBytes();
            InetAddress ip = InetAddress.getByName("localhost");
            DatagramPacket dp = new DatagramPacket(b, b.length,ip,1000);
            ds.send(dp);
            ds.close();
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}