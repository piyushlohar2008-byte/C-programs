package packages2;

public class WrappingClasses {

    public static void main(String[] args) {
        
        // int a = 5;
        // int b = 10;
        // Integer obj1 = Integer.valueOf(a);
        // Integer obj2 = Integer.valueOf(b);

        // System.out.println(obj2);
        // System.out.println(obj1);


        // char ch = 'A';

        // Character str = Character.valueOf(ch);
        // System.out.println(str);

        Integer intValue = 20;    // Autoboxing- int to Integer
        System.out.println("Autoboxing- int to Integer : "+intValue);

        int primitive = intValue;
        System.out.println("Unboxing- Integer to int : "+primitive);


        float PI = 3.1415f;
        Integer i = new Integer(primitive);
        Float f = new Float(PI);

        String str1 = Integer.toString(primitive);
        String str2 = Float.toString(PI);

        System.out.println(i);
        System.out.println(f);
        System.out.println(str1);
        System.out.println(str2);

    }
    
}