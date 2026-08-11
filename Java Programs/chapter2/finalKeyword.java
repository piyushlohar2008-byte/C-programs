package packages1;

public class finalKeyword {

    // final variable cannot be change or modify
    final static float PI = 3.1415f;   

    public static void main(String[] args) {
        
        System.out.println("PI : "+finalKeyword.PI);

    }
}

final class animal {   // final class cannot be inherited
    String name;
    int age;

    // final method cannot be override
    final void animalData(String name,int age) {  
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Animal name : "+name);
        System.out.println("Animal age : "+age);
    }
}