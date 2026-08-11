import java.awt.*;
import java.awt.event.*;

public class itemEvent extends Frame implements ItemListener {

    Choice c;
    Label l;
    itemEvent()
    {
        c = new Choice();
        c.setBounds(100,100,80,30);
        l = new Label();
        l.setBounds(100,140,80,30);

        c.add("Java");
        c.add("Python");

        add(c);
        add(l);

        setSize(500,300);
        setLayout(null);
        setVisible(true);

        c.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        l.setText("Selected "+c.getSelectedItem());
    }
    public static void main(String[] args) 
    {
        new itemEvent();
    }
    
}