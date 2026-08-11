public class throwKeyword {
    public static void main(String[] args) 
    {
        Voting v = new Voting();
        v.check(16);
    }
}

class ageException extends Exception
{
    ageException(String msg)
    {
        super(msg);
    }
}

class Voting 
{
    void check(int age)
    {
        try 
        {
            if(age < 18)
            {
                throw new ageException("Not eligible to vote");
            }
            else
            {
                System.out.println("Eligible to vote");
            }
        }
        catch (ageException e)
        {
            System.out.println(e);
        }
    }
}