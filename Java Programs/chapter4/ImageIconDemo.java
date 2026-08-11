import javax.swing.*;

public class ImageIconDemo {

    ImageIconDemo()
    {
        JFrame j = new JFrame();
        ImageIcon img = new ImageIcon("D:\\PC\\1736518020.jpg");
        JLabel lb = new JLabel(img,JLabel.CENTER);
        lb.setBounds(0,0,1000,700);
        j.add(lb);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(1000,700);
        j.setVisible(true);

    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
    
}