package packages1;

public class student extends teacher {

    String name;
    int rollno;
    student(String n, int rn){
        super("Java Programming", "M.tech");
        name = n;
        rollno = rn;
    }

    void studentdata(){
        super.greet();
        System.out.println("Student name : "+name);
        System.out.println("Student rollno : "+rollno);
    }
    
    public static void main(String[] args) {
        
        student obj = new student("Piyush", 33);
        obj.studentdata();
    }
}

class teacher{
    String sub;
    String degree;
    teacher(String sub, String degree){
        this.sub = sub;
        this.degree = degree;
    }
    void greet(){
        System.out.println("Teacher subject : "+sub);
        System.out.println("Teacher degree : "+degree);
    }
}