import java.util.*;

public class IOException {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            System.out.print("Enter no:");
            int no = sc.nextInt();
            System.out.println(no);
        }
        catch(Exception e) 
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("IO exception");
        }
        sc.close();
    }   
}