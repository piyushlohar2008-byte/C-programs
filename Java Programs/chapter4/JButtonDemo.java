import java.awt.FlowLayout;

import javax.swing.*;

public class JButtonDemo extends JFrame{

    JButton j1, j2;
    JButtonDemo()
    {
        setTitle("JButtonDemo");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,500);
        j1 = new JButton("Click");
        j2 = new JButton("Here");
        add(j1);
        add(j2);
    }
    public static void main(String[] args) {
        new JButtonDemo();
    }
}