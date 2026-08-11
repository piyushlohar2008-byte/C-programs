public class RunnableInterface 
{
    public static void main(String[] args) 
    {
        firstClass f = new firstClass();    
        secondClass s = new secondClass();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
    }
}

class firstClass implements Runnable
{
    public void run()
    {
        try
        {
            for(int i = 1; i <= 10; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {

        }
    }
}

class secondClass implements Runnable
{
    public void run()
    {
        try
        {
            for(int i = 1; i <= 10; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {

        }
    }
}