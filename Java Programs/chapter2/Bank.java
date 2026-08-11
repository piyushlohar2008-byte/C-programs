package packages1;

public class Bank {
    
    public static int count=0;
    public Bank()
    {
        count++;
    }
    public static void count(){
        System.out.println(count);
    }

    // person class or inside packages class can be access this only-
    protected String bankName;
    protected int accountNumber;
    protected String accountHolder;
    protected int mobileNumber;


    // any other class can,t be access this datamembers-
    private String bankPass ;
    private final int branchCode = 1644;
    private double balance;
    private final String ifscCode = "fteok@07";

    private void openAccount(double balance, String bankPass){
        this.bankPass = bankPass;
        this.balance = balance;
    }
    private void displayAccount(){
        System.out.println("Bank details:");
        System.out.println("Bank branch code : "+branchCode);
        System.out.println("Account balance : "+balance);
        System.out.println("Bank password : "+bankPass);
        System.out.println("Bank special code : "+ifscCode);
    }


    // for outside of packges can access this-
    boolean canBeAcessed = true;
    public void setAccount(String bankName,int accountNumber,String accountHolder,int mobileNumber){
        this.bankName = bankName;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.mobileNumber = mobileNumber;
    }
    public void getAccount(){
        if(canBeAcessed) {
        System.out.println("Bank name : "+bankName);
        System.out.println("Account holder : "+accountHolder);
        System.out.println("Account number : "+accountNumber);
        System.out.println("Mobile number : "+mobileNumber);
        }
    }

    public static void main(String[] args) {
        
        Bank obj = new Bank();
        obj.openAccount(478907935.6785,"R5tX8qLp9z");
        obj.displayAccount();

        Person p1 = new Person();
        p1.bal = 67890;
        p1.id = 33;

        
    }
}