import javax.swing.*;

public class JToolTipDemo extends JFrame{

    JToolTipDemo()
    {
        setLayout(null);
        setSize(500,600);
        JToolTip value = new JToolTip();
        value.setBounds(100,100,100,50);
        value.setToolTipText("Enter password");
        JLabel l = new JLabel("Password");
        l.setBounds(120,160,100,50);
        add(value);
        add(l);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JToolTipDemo();
    }
    
}