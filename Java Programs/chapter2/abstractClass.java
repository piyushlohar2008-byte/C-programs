public class abstractClass extends Animal {
    public void sound() {
        // Implementing abstract method
        System.out.println("Lion is barking");
    }
    public static void main(String[] args) {
        abstractClass ab = new abstractClass();
        ab.sound();
    }
}

abstract class Animal {
    // abstract method
    abstract void sound();
    // normal method
    void body() {
        System.out.println("Normal Method");
    }
}