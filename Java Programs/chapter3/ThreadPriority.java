public class ThreadPriority {
    public static void main(String[] args) {
        myThread m1 = new myThread();
        myThread m2 = new myThread();

        m1.setName("Thread1");
        m2.setName("Thread2");
        
        m1.setPriority(1);
        m2.setPriority(10);
        
        m1.start();
        m2.start();
    }
}

class myThread extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 20; i++)
        {
            System.out.println(i+" "+getPriority()+" "+getName());
        }
    }
}