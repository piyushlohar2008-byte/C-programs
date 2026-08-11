import java.awt.*;
import java.awt.event.*;

public class actionEvent2 extends Frame implements ActionListener {

    Label lb;
    actionEvent2()
    {
        Button b = new Button("Download");
        b.setBounds(100,100,80,30);
        lb = new Label();
        lb.setBounds(70,150,180,30);
        add(b);
        add(lb);

        setSize(400,500);
        setLayout(null);
        setVisible(true);

         b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        lb.setText("Download successfully...");
    }
    public static void main(String[] args) 
    {
        new actionEvent2();
    }
}