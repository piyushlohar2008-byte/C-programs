
public class symbolConstant {
    final double PI = 3.1415;
    int radius;
    void accept(int r){
        radius = r;
    }
    void display(){
        double area_of_circle = PI * radius * radius;
        System.out.println("Area of circle : "+area_of_circle);
    }
    public static void main(String[] args) {
        
        symbolConstant obj = new symbolConstant();
        obj.accept(2);
        obj.display();
    }
}