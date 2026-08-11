public class MultipleClasses {
    
    public static void main(String[] args) {
        
        Starprint obj1 = new Starprint();
        Starbinary obj2 = new Starbinary();
        obj1.no = 5;
        obj1.input();
        obj2.no = 5;
        obj2.getinfo();
    }
}

class Starprint{

    int no;
    int mid = (no/2)+1;

    void input()
    {
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no; j++) {
                if (i == mid || j == mid) System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Starbinary{

    int no;
    void getinfo()
    {
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}