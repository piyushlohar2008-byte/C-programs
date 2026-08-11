import java.util.Scanner;

public class nestingMethods extends nesting {

    void function() {
        super.method();
        // nesting of methods 
    }

    public static void main(String[] args) {
        nestingMethods obj = new nestingMethods();
        obj.function();
    }   
}

class nesting {
    void method() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int ID = sc.nextInt();
        System.out.print("Enter password: ");
        String password = sc.next();
        System.out.println("ID: "+ID);
        System.out.println("Password: "+password);
        sc.close();
    }
}