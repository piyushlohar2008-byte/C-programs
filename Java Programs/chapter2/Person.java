package packages1;

public class Person {
    
    // private static String accountPasswd = "9665@fteok";
    protected double bal = 78900;
    protected int id = 0;
    boolean access = true;

    public void getBalance()
    {
        if(access){
            System.out.println("Total balance : "+bal);
        }
    }

    public static void main(String[] args) {
        
        Bank obj = new Bank();
        obj.accountHolder = "Piyush Lohar";
        obj.accountNumber = 220989;
        obj.bankName = "SBI";
        obj.mobileNumber = 732193658;

        System.out.println("Accounter name : "+obj.accountHolder);
        System.out.println("Account number : "+obj.accountNumber);
        System.out.println("Bank name : "+obj.bankName);
        System.out.println("Mobile number : "+obj.mobileNumber);

        
        // System.out.println("Special passwd : "+Person.accountPasswd);

    }
}