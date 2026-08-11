import java.awt.*;

public class Layout3 extends Frame{
    Button b1, b2, b3, b4, b5, b6;
    Layout3() {
        setLayout(new GridLayout(4,2));
        setVisible(true);
        setSize(350,400);
        setTitle("Grid layout");
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");
        b6 = new Button("Button 6");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
    public static void main(String[] args) {
        new Layout3();
    }
}