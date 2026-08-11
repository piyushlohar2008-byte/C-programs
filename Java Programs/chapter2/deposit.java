package operation2;

import operation.Cricket;

public class deposit extends bank{
    
    void setter(String acc,double bal){
        acc_holder = acc;
        balance = bal;
    }
    void getter(){
        System.out.println("Account holder : "+acc_holder);
        System.out.println("Account balance : "+balance);
    }
    
    public static void main(String[] args) {
        
        Cricket obj = new Cricket();
        obj.display();
        deposit obj1 = new deposit();
        obj1.setter("Shraddha", 450000);
        obj1.getter();
    }
}

abstract class bank{

    String acc_holder;
    double balance;
    abstract void getter();
}