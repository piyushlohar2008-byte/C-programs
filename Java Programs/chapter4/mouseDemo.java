import java.awt.*;
import java.awt.event.*;

public class mouseDemo extends Frame implements MouseListener {

    Label l1;
    Label l2;
    Label l3;
    mouseDemo()
    {
        l1 = new Label();
        l1.setBounds(100,100,120,30);
        l2 = new Label();
        l2.setBounds(100,140,120,30);
        l3 = new Label();
        l3.setBounds(100,180,120,30);

        add(l1);
        add(l2);
        setSize(300,400);
        setLayout(null);
        setVisible(true);

        addMouseListener(this);
    }
    public void mouseEntered(MouseEvent e)
    {
        l1.setText("Enter");
    }
    public void mouseExited(MouseEvent e)
    {
        l1.setText("Exit");
    }
    public void mouseClicked(MouseEvent e)
    {     
        l2.setText("Clicked");
    }
    public void mousePressed(MouseEvent e)
    {
        l2.setText("Pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        l3.setText("Released");
    }
    public static void main(String[] args) {
        new mouseDemo();
    }
    
}