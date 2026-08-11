import javax.swing.*;
import java.awt.event.*;

public class itemEvent2 extends JFrame implements ItemListener {

    JComboBox jc;
    JLabel l;
    itemEvent2()
    {
        String mobile[] = {"Vivo","Samsung","Iphone","Oneplus","Nokia"};
        jc = new JComboBox<>(mobile);
        jc.setBounds(140,60,80,30);
        l = new JLabel();
        l.setBounds(140,140,160,30);

        add(jc);
        add(l);

        setSize(400,400);
        setLayout(null);
        setVisible(true);

        jc.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        l.setText("Select "+jc.getSelectedItem());
    }
    public static void main(String[] args) 
    {
        new itemEvent2();
    }
    
}