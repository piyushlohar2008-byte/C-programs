package packages2;

public class superKeyword extends Student{


    superKeyword() {
        super("Piyush","CSE",86.91f,33);
        // System.out.println("Welcome to super constructor");
    }
    void Input() {
        super.studentData();
        // System.out.println("Welcome to super method");
    }

    public static void main(String[] args) {
        
        superKeyword obj = new superKeyword();
        obj.Input();
    }
    
}

class Student {

    String name;
    String dept;
    float per;
    int rollno;

    Student(String name,String dept,float per,int rollno) {
        this.name = name;
        this.dept = dept;
        this.per = per;
        this.rollno = rollno;
    }

    void studentData() {
        System.out.println("Student name : "+name);
        System.out.println("Student department : "+dept);
        System.out.println("student percentage : "+per);
        System.out.println("Student rollno : "+rollno);
    }
}