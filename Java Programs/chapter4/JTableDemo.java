import javax.swing.*;
import java.awt.*;

public class JTableDemo extends JFrame{

    JTable jt;
    JTableDemo()
    {
        setLayout(new BorderLayout());
        setSize(400,500);
        String rows[][] = {{"101", "Piyush", "65080"},
                           {"102", "Aditya", "60400"},
                           {"103", "Aryan", "78700"},
                           {"104", "Raj", "67800"}
                          };
        String column[] = {"ID","NAME", "SALARY"};
        jt = new JTable(rows, column);
        jt.setBounds(100,100,80,100);
        JScrollPane jsp = new JScrollPane(jt);
        add(jsp, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JTableDemo();
    }
    
}