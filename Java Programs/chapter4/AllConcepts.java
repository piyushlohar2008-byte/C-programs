import java.awt.*;

public class AllConcepts extends Frame{

    Button login;
    TextField t1,t2;
    Label l1,l2,l3;
    Checkbox forget;
    AllConcepts() {
        setLayout(null);
        setVisible(true);
        setSize(400,600);
        setTitle("Login Page");

        l1 = new Label("Student Login Page");
        l1.setBounds(140,80,150,60);
        add(l1);

        l2 = new Label("Enter Username : ");
        l2.setBounds(80,180,100,40);
        t1 = new TextField(12);
        t1.setBounds(190,190,130,30);
        add(l2);
        add(t1);
        l3 = new Label("Enter password : ");
        l3.setBounds(80,220,100,40);
        t2 = new TextField(10);
        t2.setBounds(190,230,130,30);
        t2.setEchoChar('*');
        add(l3);
        add(t2);

        forget = new Checkbox("forget password?",false);
        forget.setBounds(140,280,140,60);
        add(forget);

        login = new Button("Login");
        login.setBounds(140,350,90,50);
        add(login);
    }
    public static void main(String[] args) {
        AllConcepts ac = new AllConcepts();
    }
    
}