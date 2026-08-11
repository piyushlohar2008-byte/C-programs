

public class typeConversion {
    
    public static void main(String[] args) {
        // explicit type conversion
        // convert byte to all datatypes
        byte a = 97;

        int x = a;              // byte to integer
        System.out.println(x);

        char ch = (char)(a);    // byte to character
        System.out.println(ch); 

        short p = (short)(a);   // byte to short
        System.out.println(p);

        long l = (long)(a);     // byte to long 
        System.out.println(l);
    }
}