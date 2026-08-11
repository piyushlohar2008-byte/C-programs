package packages1;

public class factSum {
    
    class Fact{
        int fact = 1;
        int i;
        int num;
        void getfact(int no){
            num = no;
            for(i = 1;i <= num; i++){
                fact = fact * i;
            }
           
        }
        void showFact(){
            System.out.println("Factorial of 1 to "+num+" : "+fact );
        }
    }

    class Sum{
        int sum = 0;
        int i;
        int num;
        void getSum(int no){
            num = no;
            for (int i = 1; i <= no; i++) {
                sum = sum + i;
            }
            
        }

        void showSum(){
            System.out.println("Sum of 1 to "+num+" : "+sum);
        }
    }

    public static void main(String[] args) {
        
        factSum obj = new factSum();
        Fact fact = obj.new Fact();
        Sum sum = obj.new Sum();
        fact.getfact(10);
        fact.showFact();
        sum.getSum(20);
        sum.showSum();

        // insideStaticClass Static = new insideStaticClass();
        // Static.Details("Aditya", 17);
        // Static.showDetails();
    }
}