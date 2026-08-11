package operation2;

public class Encapsulation {
    
    static void printHello(){
        System.out.println("Hello world");
    }
    // public void printHi(){
    //     System.out.println("Hii");
    // }

    // defining static block-
    static{
        System.out.println("First static block");  // static block always call first
    }

    public static void main(String[] args) {
        
        dataHiding obj = new dataHiding();
        // dataHiding obj1 = new dataHiding();
        obj.setAge(25);
        obj.getAge();
        System.out.println(dataHiding.count);  // static variable called only classname

        Encapsulation.printHello();  // static method called by only classname
        // printHi();  // non-static method always call using object

    }
    static{
        System.out.println("Second static block");
    }
}   