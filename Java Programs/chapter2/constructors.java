public class constructors {
    
    public static void main(String[] args) {
        
        Addition obj = new Addition();   // creating object to call constructors
        obj.print();
    }
}

class Addition{
    int a,b;

    public Addition(){          // default constructor
        a = 10;
        b = 20;
    }
    void print(){
        int result;
        result = a + b;
        System.out.println("Addition is : "+result);
    }
}