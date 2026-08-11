public class circle extends rectangle{
    
    public static void main(String[] args) {
        
        circle obj = new circle();
        int rad = 2;
        float result = obj.compute(10, rad);
        System.out.println("Area : "+obj.PI*rad*rad);
        System.out.println("Area : "+result);
    }
}

interface Innercircle {

    final float PI = 3.1415f;
    float compute(float x,float y);
}

class rectangle implements Innercircle
{
    public float compute(float x,float y){
        return (x * y);
    }
}