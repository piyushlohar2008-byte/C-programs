
public class createFunctions {
    
    int num1,num2;
    int min;
    void input(int n1,int n2){
        num1 = n1;
        num2 = n2;
    }
    int loop(){
        if (num1 > num2) {
            min = num2;
        }
        else{
            min = num1;
        }
        return min;
    }

    public static void main(String[] args) {
        
        createFunctions obj = new createFunctions();
        obj.input(8, 10);
        int result = obj.loop();
        System.out.println("Mininum : "+result);
    }
}