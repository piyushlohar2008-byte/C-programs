public class ThreadDemo {
    public static void main(String[] args) 
    {
        myThread my = new myThread();
        my.start();
    }   
}

class myThread extends Thread
{
    public void run()
    {
        try 
        {
            for (int i = 1; i <= 10; i++) 
            {
                System.out.print(i+" ");
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}