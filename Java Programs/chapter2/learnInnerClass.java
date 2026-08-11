package packages1;

public class learnInnerClass {
    
    class Toy{

        int price;
        void accept(int price){
            this.price = price;
        }

        void toyData(){
            System.out.println("Price : "+price);
        }

        public static void main(String[] args) {
            
            learnInnerClass obj = new learnInnerClass();
            Toy toy = obj.new Toy();  // accessing class object 
            toy.accept(450);
            toy.toyData();
        }
    }
}
