package packages1;

public class Animal {

    public static void main(String[] args) {
        
        Access obj = new Access();
        System.out.println("Legs of all animal : "+Access.LEGS);
        obj.lion();
        obj.cat();
        obj.dog();
        obj.walk();
    }
    
}

interface Lion{
    int LEGS = 4;
    void lion();

    default void walk(){
        System.out.println("Lion is walking");  // define method body in interface using default keyword
    }
}

interface Cat extends Lion{
    void cat();
}

interface Dog extends Cat{

    void dog();
}

interface Monkey extends Dog{
    void monkey();
}

class Access implements Lion, Cat, Dog, Monkey{  // implementing all interface 

    @Override
    public void monkey() {
    
       System.out.println("Monkey is laughing");
    }

    @Override
    public void dog() {
        
        System.out.println("Dog is takling");
    }

    @Override
    public void cat() {
       
        System.out.println("Cat is walking");
    }

    @Override
    public void lion() {
        
        System.out.println("Lion is barking");
    }

}