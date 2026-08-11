import java.net.*;

public class UDPReceiver {
    public static void main(String[] args) 
    {
        try
        {
            DatagramSocket ds = new DatagramSocket(1002);
            byte[] b = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b, b.length);
            ds.receive(dp);
            String reply = new String(dp.getData(),0,dp.getLength());
            System.out.println(reply);
            ds.close();
        }    
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}