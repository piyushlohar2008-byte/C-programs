import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(4,4));

        JButton b0 = new JButton("7");
        b0.setFont(new Font("Arial",Font.BOLD,20));
        b0.setForeground(Color.RED);
        JButton b1 = new JButton("8");
        b1.setForeground(Color.RED);
        b1.setFont(new Font("Arial",Font.BOLD,20));
        JButton b2 = new JButton("9");
        b2.setForeground(Color.RED);
        b2.setFont(new Font("Arial",Font.BOLD,20));
        JButton b3 = new JButton("/");
        b3.setFont(new Font("Arial",Font.BOLD,20));
        JButton b4 = new JButton("4");
        b4.setForeground(Color.RED);
        b4.setFont(new Font("Arial",Font.BOLD,20));
        JButton b5 = new JButton("5");
        b5.setForeground(Color.RED);
        b5.setFont(new Font("Arial",Font.BOLD,20));
        JButton b6 = new JButton("6");
        b6.setForeground(Color.RED);
        b6.setFont(new Font("Arial",Font.BOLD,20));
        JButton b7 = new JButton("*");
        b7.setFont(new Font("Arial",Font.BOLD,20));
        JButton b8 = new JButton("1");
        b8.setForeground(Color.RED);
        b8.setFont(new Font("Arial",Font.BOLD,20));
        JButton b9 = new JButton("2");
        b9.setForeground(Color.RED);
        b9.setFont(new Font("Arial",Font.BOLD,20));
        JButton b10 = new JButton("3");
        b10.setForeground(Color.RED);
        b10.setFont(new Font("Arial",Font.BOLD,20));
        JButton b11 = new JButton("-");
        b11.setFont(new Font("Arial",Font.BOLD,20));
        JButton b12 = new JButton("0");
        b12.setForeground(Color.RED);
        b12.setFont(new Font("Arial",Font.BOLD,20));
        JButton b13 = new JButton(".");
        b13.setFont(new Font("Arial",Font.BOLD,20));
        JButton b14 = new JButton("=");
        b14.setFont(new Font("Arial",Font.BOLD,20));
        JButton b15 = new JButton("+");
        b15.setFont(new Font("Arial",Font.BOLD,20));

        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);

        f.setSize(550,700);
        f.setVisible(true);
    }
}