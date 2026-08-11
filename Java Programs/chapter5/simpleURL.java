import java.net.*;

public class simpleURL {
    public static void main(String[] args) throws Exception 
    {
        URL u = new URL("https://www.google.com/index.html");
        System.out.println("Protocal:"+u.getProtocol());
        System.out.println("Host:"+u.getHost());
        System.out.println("Post:"+u.getPort());
        System.out.println("File:"+u.getFile());
    }
}