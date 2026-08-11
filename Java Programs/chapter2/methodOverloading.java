public class methodOverloading {

    public static void main(String[] args) {
        
        Greet obj = new Greet();
        obj.getinfo();
        obj.getinfo("Piyush");
        obj.getinfo("Shraddha", 25);
        
        Concept c1 = new Concept();
        c1.getdata(5);
        c1.getdata(10, 1);
    }
}

class Greet{

    void getinfo(){
        System.out.println("Hello, good morning");
    }

    void getinfo(String name){
        System.out.println("Hello "+name+", good morning");
    }
    void getinfo(String name,int age){
        System.out.println("My name is "+name+", i am "+age+" years old");
    }
}

class Concept{

    void getdata(int no){
        int sum = 0;
        for (int i = 1; i <= no; i++) {
            sum+=i;
        }
        System.out.println("Sum of natural number : "+sum);
    }
    void getdata(double num,int fact){
        for (int i = 1; i <= num; i++) {
            fact*=i;
        }
        System.out.println("Factorial number : "+fact);
    }
}