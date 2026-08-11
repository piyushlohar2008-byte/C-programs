import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        short a = obj.nextShort();
        short b = obj.nextShort();
        short c = obj.nextShort();

        if(a > b && a > c){                     // Logical AND (&&) operator
            System.out.println("Largest is "+a);
        }
        else if(b > a && b > c){
            System.out.println("Largest is "+b);
        }
        else{
            System.out.println("Largest is "+c);
        }


        System.out.print("Enter percentage : ");
        float per = obj.nextFloat();

        if(per<=90 || per>=80){                 // Logical OR (||) operator
            System.out.println("First class");
        }
        else{
            System.out.println("Pass");
        }
        if(!false){                             // Logical  NOT (!) operator
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
        obj.close();
    }
}