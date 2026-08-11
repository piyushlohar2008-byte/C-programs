import javax.swing.*;

public class Image extends JFrame{

    Image()
    {
        ImageIcon img = new ImageIcon("C:\\Users\\student\\Desktop\\New folder\\wp4844002.jpg");
        JLabel lb = new JLabel(img);
        add(lb);
        setSize(3000,1000);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Image();
    }
    
}