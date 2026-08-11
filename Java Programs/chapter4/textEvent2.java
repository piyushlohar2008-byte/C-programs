import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class textEvent2 implements TextListener {

    TextArea a;
    textEvent2()
    {
        JFrame f = new JFrame();
        a = new TextArea();
        a.setBounds(100,100,100,60);
        f.add(a);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

        a.addTextListener(this);
    }
    public void textValueChanged(TextEvent e)
    {
        System.out.println("Text : "+a.getText());
    }
    public static void main(String[] args) 
    {
        new textEvent2();    
    }
}