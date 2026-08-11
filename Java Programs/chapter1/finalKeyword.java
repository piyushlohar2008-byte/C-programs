public class finalKeyword {
    
    final float PI = 3.1415f;  
     
    // void greet()         // final method cannot be overidden 
    // {
    //     System.out.println("Welcome to our kolhapur");
    // }

    public static void main(String[] args) {
        finalKeyword obj = new finalKeyword();
        // obj.PI = 3.1457f;   // final variable cannot be change or modify
        System.out.println(obj.PI);


    }
}

final class person    // final class cannot be extends by superclass
{
    final void greet()
    {
        System.out.println("Welcome to python programming");
    }
}