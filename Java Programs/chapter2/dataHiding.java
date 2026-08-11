package operation2;

public class dataHiding {

    public static int count = 0;
    dataHiding(){
        count++;
    }
    
    
    private static String city = "Kolhapur";
    private int age;
    public void setAge(int age){
        this.age = age;
    }
    public void getAge(){
        System.out.println("Age : "+age);
    }
    public static void main(String[] args) {
        
        System.out.println(dataHiding.city);
    }
}