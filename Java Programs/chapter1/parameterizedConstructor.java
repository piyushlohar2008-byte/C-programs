public class parameterizedConstructor {
    public static void main(String[] args) {
        Teacher t = new Teacher("Shraddha", "Java", "CSE");
        t.teacherInfo();
    }
}

class Teacher {
    String name;
    String subject;
    String dept;
    Teacher(String n, String sub, String d) {
        this.name = n;
        this.subject = sub;
        this.dept = d;
    }
    void teacherInfo() {
        System.out.println("Name: "+name);
        System.out.println("Subject: "+subject);
        System.out.println("Department: "+dept);
    }
}