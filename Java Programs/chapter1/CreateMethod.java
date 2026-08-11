
public class CreateMethod {
    
    String name;
    int age;
    void accept(String n,int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) {
        
        CreateMethod obj = new CreateMethod();
        obj.accept("Piyush", 20);
        obj.display();
    }
}