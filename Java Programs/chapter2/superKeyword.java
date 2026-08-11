public class superKeyword extends Dog {
    
    int age = 4;
    superKeyword()
    {
        super("pitbull","Red");
        System.out.println("Age of cat : "+age);
    }
    public static void main(String[] args) {
        
        superKeyword obj = new superKeyword();
        obj.show();
    }
}

class Dog{

    String name;
    String color;
    Dog(String n,String c)
    {
        name = n;
        color = c;
    }
    void show()
    {
        System.out.println("Dog name : "+name);
        System.out.println("Dog color : "+color);
    }
}