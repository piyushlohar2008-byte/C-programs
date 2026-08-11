import java.awt.*;

public class Layout2 extends Frame{

    Button b1, b2, b3, b4, b5;
    Layout2() {
        setLayout(new BorderLayout(4,4));
        setVisible(true);
        setTitle("Border layout");
        setSize(350,380);
        b1 = new Button("NORTH");
        b2 = new Button("EAST");
        b3 = new Button("SOUTH");
        b4 = new Button("WEST");
        b5 = new Button("CENTER");
        b5.setFont(new Font("Times New Romes",Font.BOLD,24));
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        
        new Layout2();
    }
}