import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        long a = obj.nextLong();
        long b = obj.nextLong();
        long c;

        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter your choice : ");
        int choice = obj.nextInt();

        switch (choice){
            case 1:
                c = a + b;
                System.out.println("Addition is : "+c);
                break;
            case 2:
                c = a - b;
                System.out.println("Substraction is : "+c);
                break;
            case 3:
                c = a * b;
                System.out.println("Multiplication is : "+c);
                break;
            case 4:
                c = a / b;
                System.out.println("Division is : "+c);
                break;
            default:
                System.out.println("Invalid entered");
        }
        obj.close();
    }
}