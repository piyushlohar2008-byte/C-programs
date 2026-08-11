import java.net.*;

public class getPCIP {
    public static void main(String[] args) {
        
        try 
        {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Hostname : "+ip.getHostName());
            System.out.println("IP Address : "+ip.getHostAddress());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}