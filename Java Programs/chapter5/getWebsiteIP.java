import java.net.*;

public class getWebsiteIP {
    public static void main(String[] args) {
        
        try 
        {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("Hostname : "+ip.getHostName());
            System.out.println("IP Address : "+ip.getHostAddress());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}