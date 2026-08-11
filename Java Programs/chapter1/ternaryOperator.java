import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age;
        System.out.print("Enter your age : ");
        age = obj.nextInt();
        String result = (age>=18) ? "You can vote" : "You cannot vote";
        System.out.println(result);
        obj.close();
    }
}