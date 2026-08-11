public class subclass extends superClass {
    
    double deposit;
    subclass(double deposit)
    {
        super("Harshad mehata",4500000);
        this.deposit = deposit;
    }
    void display()
    {
        super.greet();
        System.out.println("Deposit : "+deposit);
    }

    public static void main(String[] args) {
        
        subclass obj = new subclass(90000);
        obj.display();
    }
}

class superClass
{

    String acc_holder;
    double amount;

    superClass(String acc_holder, double amount)
    {
        this.acc_holder = acc_holder;
        this.amount = amount;
    }

    void greet()
    {
        System.out.println("Account holder : "+acc_holder);
        System.out.println("Total amount : "+amount);
    }
}