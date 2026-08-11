class Division
{
    void Test(int a, int b) throws ArithmeticException
    {
        int div = a / b;
        System.out.println("Division:"+div);
    }
}

public class throwsException {
    public static void main(String[] args) 
    {
        Division d = new Division();
        try
        {
            d.Test(10, 0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }   
}