import java.awt.*;
import java.awt.Event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RadioButton extends Frame{

    Button b1, b2;
    Checkbox c1, c2;
    RadioButton()
    {
        setLayout(null);
        setTitle("Radio buttons and chechbox");
        setSize(550,600);
        b1 = new Button("Click here");
        b2 = new Button("Click here");
        c1 = new Checkbox("Java",false);
        c2 = new Checkbox("Python",false);
        addWindowListener(new WindowAdapter() {
        });
        c1.setBounds(150,140,70,40);
        c2.setBounds(250,140,70,40);
        b1.setBounds(130,200,80,40);
        b2.setBounds(240,200,80,40);
        add(c1);
        add(c2);
        add(b1);
        add(b2);
        setVisible(true);
    }
    public static void main(String[] args) {
        RadioButton obj = new RadioButton();
    }
    
}