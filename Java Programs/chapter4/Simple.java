import java.awt.*;

public class Simple extends Frame{
    
    Label l1,l2;
    Simple() {
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        setTitle("ForeGround");
        l1 = new Label("Hello");
        l2 = new Label("World");
        l1.setBounds(100,100,80,40);
        l2.setBounds(180,100,80,40);
        l1.setFont(new Font("Times new Romes",Font.CENTER_BASELINE,26));
        l2.setFont(new Font("Times New Romes",Font.CENTER_BASELINE,26));
        l1.setForeground(Color.BLUE);
        l2.setForeground(Color.GREEN);
        add(l1);
        add(l2);
    }
    public static void main(String[] args) {
        new Simple();
    }
}