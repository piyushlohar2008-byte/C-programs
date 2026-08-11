public class extendingInterface implements C{
    public void addition() {
        int sum = extendingInterface.a + extendingInterface.b;
        System.out.println("Addition: "+sum);
    }
    public void substraction() {
        int sub = extendingInterface.x - extendingInterface.y;
        System.out.println("Square: "+sub);
    }
    public void square() {
        int square = extendingInterface.p * extendingInterface.p;
        System.out.println("Square: "+square);
    }
    public static void main(String[] args) {
        extendingInterface obj = new extendingInterface();
        obj.addition();
        obj.substraction();
        obj.square();
    }
}

interface A {
    int a = 20;
    int b = 25;
    public void addition();
}

interface B {
    int x = 65;
    int y = 45;
    public void substraction();
}

// Interface supports multiple inheritance
interface C extends A, B {
    int p = 7;
    public void square();
}