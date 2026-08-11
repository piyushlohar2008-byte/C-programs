import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class textEvent implements TextListener{
    
    TextField t;
    textEvent()
    {
        JFrame j = new JFrame("Text Event");
        String msg = "Java";
        t = new TextField(msg);
        t.setBounds(100,100,100,30);

        j.add(t);
        j.setSize(300,300);
        j.setLayout(null);
        j.setVisible(true);

        t.addTextListener(this);

    }
    public void textValueChanged(TextEvent e)
    {
        System.out.println("Text Changed "+t.getText());
    }
    public static void main(String[] args) 
    {
        new textEvent();    
    }
}