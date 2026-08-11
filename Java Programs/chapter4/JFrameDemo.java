import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    JFrame jf;
    JLabel l1, l2;
    JFrameDemo()
    {
        jf = new JFrame("JFrame");
        jf.setVisible(true);
        jf.setSize(300,450);
        jf.setLayout(new FlowLayout());
        l1 = new JLabel("Hello");
        l2 = new JLabel("World");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(l1);
        jf.add(l2);
    }
    public static void main(String[] args) {
        JFrameDemo j = new JFrameDemo();
    }
    
}