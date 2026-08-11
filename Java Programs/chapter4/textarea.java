import java.awt.*;

public class textarea extends Frame{

    String Message = "Welcome to java launguage programming and python programming this to are pure object oriented programming launguage";
    TextArea t1;
    textarea() {
        setLayout(null);
        setVisible(true);
        setSize(500,350);
        setTitle("Text Area");

        t1 = new TextArea(Message);
        t1.setBounds(80,100,300,100);
        add(t1);
    }
    public static void main(String[] args) {
        
        textarea ta = new textarea();
    }
}