public class MethodsJava {
    
    int a,b;
    void accept(int x,int y){
        a = x;
        b = y;
    }
    void display(){
        int sum = a + b;
        System.out.println("Addition is : "+sum);
    }

    public static void main(String[] args) {
        MethodsJava obj = new MethodsJava();
        int p = 10;
        int q = 20;
        obj.accept(p, q);
        obj.display();
    }
}