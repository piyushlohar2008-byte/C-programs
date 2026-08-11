package packages1;

public class mathsProblem implements circle, rectangle ,square{

    float rad = 2.0f;
    float width = 4.6f;


    @Override
    public void read() {
       float area_of_circle = PI * rad * rad;
        System.out.println("Area of circle : "+area_of_circle);
    }

    @Override
    public void compute() {
        float area_of_rectangle = length * width;
        System.out.println("Area of reectangle : "+area_of_rectangle);
    }

    @Override
    public void display() {
       float area_of_square = side * side;
       System.out.println("Area of square : "+area_of_square);
    }
    
    public static void main(String[] args) {
        mathsProblem obj = new mathsProblem();
        obj.read();
        obj.compute();
        obj.display();
    }
    
}

interface circle{
    float PI = 3.1415f;
    void read();
}

interface rectangle{
    float length = 6.78f;
    void compute();
}

interface square{
    float side = 8.9f;
    void display();
}