import java.net.*;
import java.io.*;

public class URl_Connection {
    public static void main(String[] args) throws Exception
    {
        URL u = new URL("file:///D:/HTML/chapter1/MyWeb/Website.html");
        URLConnection uc = u.openConnection();
        InputStream is = uc.getInputStream();
        int i;
        while ((i = is.read())!= 0) {
            System.out.print((char)i);
        }
    }
}