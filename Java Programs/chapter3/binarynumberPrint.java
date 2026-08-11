import java.util.Scanner;

public class binarynumberPrint {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);   // get input to object

        System.out.print("Enter number of rows & cols : ");
        int no = obj.nextInt();

        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {                // condition (i+j)%2==0 then print 1 
                    System.out.print("1 ");
                }
                else{                            // else print 0
                    System.out.print("0 ");
                }
            }
            System.out.println();  // goto next line
        }
        obj.close();   // close input number object
    }
}