public class WrapperClass {
    public static void main(String[] args) {
        //Wrapper class used to convert primitive datatype in object

        int x = 10;
        Integer obj = Integer.valueOf(x);
        System.out.println(obj.floatValue());

        //Auto boxing-
        int a = 50;
        Integer obj1 = a;
        System.out.println(obj1);
        float pi = 3.1415f;
        Float obj2 = pi;
        System.out.println(obj2.intValue());

        //Unboxing-
        Double obj3 = 3.1415;
        double value = obj3;
        System.out.println(value);
        Character obj4 = 'X';
        char ch = obj4;
        System.out.println(ch);
    }   
}