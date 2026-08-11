package operation;

public class Demo {

    String degree;              // default access modifier
    protected int id;           // protected access modifier
    public String name;         // public access modifier
    private int studentCount;   // private access modifier

    public static void main(String[] args) {

        Demo obj = new Demo();
        System.out.println("Hello World");
        obj.name = "Piyush";
        obj.studentCount = 12;
        System.out.println("Students : "+obj.studentCount);
    }   
}