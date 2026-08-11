import java.net.*;

public class websiteAllAddress {
    public static void main(String[] args) {
        
        try 
        {
            InetAddress ip[] = InetAddress.getAllByName("www.yahoo.com");
            for (int i = 0; i < ip.length; i++) {
                System.out.println(ip[i].getHostName()+" "+ip[i].getHostAddress());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}