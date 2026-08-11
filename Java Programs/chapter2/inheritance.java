public class inheritance extends Cars{
    
    inheritance(String color)
    {
        System.out.println("Welcome to NFS world with "+color+" color");
    }
    void start()
    {
        // super.start();       // super keyword use to access method or constructors in base class
        System.out.println("Vehicle is starting");
    }

    public static void main(String[] args) {
        inheritance obj = new inheritance("Red");
        obj.name = "BMW";
        obj.model = "m5css";
        // obj.end();
        obj.start();
    }
}

class Cars{

    String name;
    String model;
    Cars()
    {
        System.out.println("BMW is a car");
    }
    void start()
    {
        System.out.println("Car is starting");
    }
    void end()
    {
        System.out.println("Car name : "+name);
        System.out.println("Car model : "+model);
    }
}