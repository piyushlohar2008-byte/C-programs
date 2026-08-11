import java.awt.*;
import java.awt.event.*;

public class actionEvent extends Frame implements ActionListener {

    actionEvent()
    {
        Button b = new Button("Click");
        b.setBounds(100,100,60,30);
        add(b);
        b.addActionListener(this);

        setSize(500,600);
        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Button clicked");
    }

    public static void main(String[] args) 
    {
        
        new actionEvent();
    }
}