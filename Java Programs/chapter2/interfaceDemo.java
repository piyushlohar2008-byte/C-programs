public class interfaceDemo implements Maths {
    // Implementing interface method
    public void area() {
        // access interface using only className because they are static
        float result = interfaceDemo.PI * interfaceDemo.radius * interfaceDemo.radius;
        System.out.println("Area of circle: "+result);
    }
    public static void main(String[] args) {
        interfaceDemo demo = new interfaceDemo();
        demo.area();
    }
}

interface Maths {
    // variables is public, static, final by default
    float radius = 2.0f;
    float PI = 3.1415f;
    // method is abstract by default
    public void area();
}