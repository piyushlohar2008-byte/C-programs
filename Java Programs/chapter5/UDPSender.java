import java.net.*;

public class UDPSender {
    public static void main(String[] args) 
    {
        try
        {
            DatagramSocket ds = new DatagramSocket();
            String message = "This is from sender";
            byte[] b = message.getBytes();
            InetAddress ip = InetAddress.getByName("localhost");
            DatagramPacket dp = new DatagramPacket(b, b.length,ip,1002);
            ds.send(dp);
            ds.close();
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}