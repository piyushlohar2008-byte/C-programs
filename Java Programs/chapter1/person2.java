package packages2;
import packages1.Person;
import packages1.Bank;

public class person2 {

    static{
        System.out.println("Another person bank details:");
    }

    public static void main(String[] args) {
        
        Bank obj = new Bank();
        // Bank obj1 = new Bank(); 
        obj.setAccount("HDFC", 112647, "Harshad Mehata", 934560561);
        // obj.getAccount();
        // Bank.count();   // call static method

        Person p = new Person();
        p.getBalance();
    }
}