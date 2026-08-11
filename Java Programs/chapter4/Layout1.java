import java.awt.*;

public class Layout1 extends Frame{

    Button b1, b2, b3, b4, b5, b6, b7, b8;
    Layout1() {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,200);
        setTitle("Flow layout");
        b1 = new Button("Button1");
        add(b1);
        b2 = new Button("Button2");
        add(b2);
        b3 = new Button("Button3");
        add(b3);
        b4 = new Button("Button4");
        add(b4);
        b5 = new Button("Button5");
        add(b5);
        b6 = new Button("Button6");
        add(b6);
        b7 = new Button("Button7");
        add(b7);
        b8 = new Button("Button8");
        add(b8);
        
    }
    public static void main(String[] args) {
        Layout1 l = new Layout1();
    }
    
}