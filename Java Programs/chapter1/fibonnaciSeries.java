import java.util.Scanner;

public class fibonnaciSeries {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number os series : ");
        int no = sc.nextInt();
        int n1=0,n2=1,n3;
        int i;
        System.out.print(n1);
        System.out.print(" ");
        System.out.print(n2);
        for(i=2;i<no;i++)
        {
            n3 = n1 + n2;
            System.out.print(" ");
            System.out.print(n3);
            n1 = n2;
            n2 = n3;
        }
        sc.close();
    }
}