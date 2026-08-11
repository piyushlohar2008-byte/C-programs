public class constructorOverloading {
    
    public static void main(String[] args) {
        
        Multiplication obj1 = new Multiplication(5,6);
        Multiplication obj2 = new Multiplication(10);
        obj1.output();
        obj2.output();
    }
}

class Multiplication{

    int a,b;

    public Multiplication(int x,int y){
        a = x;
        b = y;
    }
    public Multiplication(int p){
        a = p;
        b = 10;
    }
    void output(){
        int result;
        result = a * b;
        System.out.println("Multiplication is : "+result);
    }
}