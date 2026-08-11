import java.awt.*;
import javax.swing.*;

public class JRadioButtonDemo extends JFrame{

    JRadioButton r1, r2;
    JRadioButtonDemo()
    {
        Panel p = new Panel();
        p.setBounds(10,10,400,500);
        p.setBackground(Color.WHITE);
        setSize(400,500);
        setVisible(true);
        setTitle("JRadioButtonDemo");
        r1 = new JRadioButton("Java",true);
        r1.setBounds(100,100,80,40);
        r2 = new JRadioButton("C++");
        r2.setBounds(180,100,80,40);
        r1.setForeground(Color.PINK);
        r2.setForeground(Color.PINK);
        add(r1);
        add(r2);
    }
    public static void main(String[] args) {
        new JRadioButtonDemo();
    }
    
}