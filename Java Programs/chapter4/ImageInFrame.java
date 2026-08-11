import javax.swing.*;

public class ImageInFrame{
    
    public static void main(String[] args) throws Exception{
        JFrame j = new JFrame("Image Demo");
        ImageIcon I = new ImageIcon("D://PC//sample");
        JLabel l = new JLabel(I);
        j.add(l);
        j.setSize(800,600);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}