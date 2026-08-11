import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number : ");
        int no = obj.nextInt();
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(no+" x "+i+" = "+no*i);
        }
        obj.close();
    }
}