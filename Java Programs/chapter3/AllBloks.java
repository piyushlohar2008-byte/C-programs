public class AllBloks {
    public static void main(String[] args) 
    {
        int x = 5;
        int y = 0;
        try 
        {
            int z = x / y;
            System.out.println(z); 
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally 
        {
            System.out.println("After exception");
        }
    }
}