import java.awt.*;
import javax.swing.*;

public class JavaScroll extends JFrame{

    JavaScroll()
    {
        setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        int b = 0;
        jp.setLayout(new GridLayout(10,10));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                jp.add(new JButton("Buttons"+b));
                ++b;
            }
            
        }
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp = new JScrollPane(jp,v,h);
        add(jsp,BorderLayout.CENTER);
        setSize(300,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new JavaScroll();
    }
}