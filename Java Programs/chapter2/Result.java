package operation;

public class Result extends Student implements Sports, PC{

    public void getPC(){
        System.out.println(name);
    }

    public void putWt(){
        System.out.println(sportWT);
    }
    void display()
        {
            long total = part1 + part2;
            putno();
            putmarks();
            putWt();
            System.out.println("Total : "+total);
        }

    public static void main(String[] args) {

        Result obj = new Result();
        obj.getno(33);
        obj.getmarks(67, 45);
        obj.display();
        obj.getPC();
        
        
    }    
}

class Student extends Test{
    int rollno;
    void getno(int rn){
        rollno = rn;
    }
    void putno(){
        System.out.println("Rollno : "+rollno);
    }
}

class Test{
    long part1;
    long part2;
    void getmarks(long p1,long p2){
        part1 = p1;
        part2 = p2;
    }
    void putmarks(){
        System.out.println("Marks obtained");
        System.out.println("Part 1 : "+part1);
        System.out.println("Part 2 : "+part2);
    }
}

interface Sports {

    final float sportWT = 8.2f;
    void putWt();
}

interface PC{
    String name = "Apple";
    void getPC();
}