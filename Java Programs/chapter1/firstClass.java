class secondClass {
    String name;
    int age;
}

public class firstClass {
    public static void main(String[] args) {
        secondClass s = new secondClass();
        s.name = "Piyush";
        s.age = 18;
        System.out.println(s.name);
        System.out.println(s.age);
    }
}