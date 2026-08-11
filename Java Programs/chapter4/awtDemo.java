import java.awt.*;

public class awtDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        Label l1 = new Label("Name");
        l1.setBounds(80,100,50,30);
        TextField t1 = new TextField(20);
        t1.setEchoChar('*');
        t1.setBounds(140,100,140,30);

        Label l2 = new Label("City");
        l2.setBounds(85,140,50,30);
        TextField t2 = new TextField(20);
        t2.setBounds(140,140,140,30);

        CheckboxGroup cbc = new CheckboxGroup();
        Checkbox cb = new Checkbox("Java",cbc, false);
        cb.setBounds(120,200,50,30);
        
        Button b = new Button("Submit");
        b.setBounds(160,220,60,40);

        f.add(t2);
        f.add(l2);
        f.add(b);
        f.add(l1);
        f.add(t1);
        f.add(cb, BorderLayout.CENTER);
        f.setSize(400,500);
        f.setVisible(true);
        f.setLayout(null);
    }
}