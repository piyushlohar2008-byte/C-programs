public class functionOverloading {
    public static void main(String[] args) {
        overlaoding obj = new overlaoding();
        int result1 = obj.addition(6);
        int result2 = obj.addition(5,"5");
        int result3 = obj.addition(65, 45);
        int result4 = obj.addition(10, 20, 15);
        System.out.println("Square: "+result1);
        System.out.println("Cube: "+result2);
        System.out.println("Substraction: "+result3);
        System.out.println("Addition: "+result4);
    }
}

class overlaoding {
    int addition(int sqr) {
        return sqr * sqr;
    }
    int addition(int cube, String str) {
        int x = Integer.parseInt(str);
        return cube * x * cube;
    }
    int addition(int a, int b) {
        return a - b;
    }
    int addition(int x, int y, int z) {
        return x + y + z;
    }
}