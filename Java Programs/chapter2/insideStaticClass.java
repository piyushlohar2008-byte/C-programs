package packages1;

public class insideStaticClass {

    static{
        System.out.println("This is static class inside another class");
    }

    static class vehicles{   // static class declare inside the another class 

        static int count=0;
        void Count(){
            count++;
        } 

        void showCount(){
            System.out.println("Count : "+count);
        }
    }

    String name;
    int age;
    public void Details(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void showDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) {
        
        vehicles car = new insideStaticClass.vehicles();  // access class
        car.Count();
        car.Count();
        car.showCount();
        insideStaticClass obj = new insideStaticClass();
        obj.Details("Piyush", 18);
        obj.showDetails();
    }
    
}