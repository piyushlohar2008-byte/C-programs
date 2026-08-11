import java.awt.*;

public class textField extends Frame{
    
    Label l1, l2;
    TextField t1, t2;
    textField() {
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        setTitle("Login");

        l1 = new Label("Enter username : ");
        l1.setBounds(50,100,100,40);
        t1 = new TextField(12);
        t1.setBounds(160,100,120,40);
        add(l1);
        add(t1);
        l2 = new Label("Enter password : ");
        l2.setBounds(50,180,100,40);
        t2 = new TextField(10);
        t2.setBounds(160,180,120,40);
        t2.setEchoChar('*');
        add(l2);
        add(t2);
    }
    public static void main(String[] args) {
        textField t = new textField();
    }

}