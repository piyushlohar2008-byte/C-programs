import javax.swing.*;
import java.awt.*;

public class JTextFieldDemo extends JFrame{

    JTextField t1;
    JLabel l1;
    JTextFieldDemo()
    {
        Panel p = new Panel();
        p.setBounds(0,0,400,500);
        p.setBackground(Color.CYAN);
        setLayout(null);
        setVisible(true);
        setSize(400,500);
        l1 = new JLabel("TextField:");
        l1.setBounds(40,100,80,30);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Times New Romes",Font.BOLD,14));
        add(l1);
        t1 = new JTextField();
        t1.setBounds(120,100,100,30);
        add(t1);
        setTitle("JTextFieldDemo");

    }
    public static void main(String[] args) {
        new JTextFieldDemo();
    }
    
}