public class multipleClass {
    
    public static void main(String[] args) {
        
        Dog obj = new Dog();
        Dog obj1 = new Dog();
        obj.name = "Tommy";
        obj.greet();
        obj.treet();
        obj1.name = "Puppy";
        obj1.greet();
        Cat c = new Cat();
        c.name = "Sweety";
        c.input();
    }
}

class Dog{
    String name;
    int age;

    void greet(){
        System.out.println(name+" are walking");
    } 
    void treet(){
        System.out.println(name+" are barking");
    }
}
class Cat{
    String name;
    String color;
    void input(){
        System.out.println(name+" is very smart");
    }
}