import java.awt.*;
import javax.swing.*;

public class SwingComponent extends JFrame{

    SwingComponent()
    {
        setLayout(new BorderLayout(2,2));
        JButton j1 = new JButton("Left");
        JButton j2 = new JButton("Right");
        JButton j3 = new JButton("Top");
        JButton j4 = new JButton("bottom");

        add(j1, BorderLayout.WEST);
        add(j2, BorderLayout.EAST);
        add(j3, BorderLayout.NORTH);
        add(j4, BorderLayout.SOUTH);

        setSize(500,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingComponent();
    }
}