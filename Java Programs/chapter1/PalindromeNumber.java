public class PalindromeNumber {
    public static void main(String[] args) {
        int pal=0;
        int digit=0,temp;
        int no = 12321;
        temp = no;
        while(no!=0)
        {
            digit = no % 10;
            pal = (10 * pal) + digit;
            no/=10;
        }
        if(temp==pal)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
        }
}