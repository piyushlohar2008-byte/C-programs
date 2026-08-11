public class complexNumber {
    
    public static void main(String[] args) {
        
        Complex num1 = new Complex(5,4);
        Complex num2 = new Complex(3,6);
        num1.show();
        num2.show();
        System.out.println("Addition two numbers : ");
        Complex result = num1.add(num2);
        result.show();
    }
}

class Complex{

    int a,b;

    public Complex(int real,int imaginary){
        a = real;
        b = imaginary;
    }

    void show(){
        System.out.println(a+" + "+b+"i");
    }

    Complex add(Complex num2){
        Complex newNum = new Complex(a+num2.a, b+num2.b);
        return newNum;
    }
}