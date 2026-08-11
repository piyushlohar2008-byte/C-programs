import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends Frame implements KeyListener {

    Label l;
    Label l2;
    KeyDemo()
    {
        l = new Label();
        l.setBounds(100,100,120,30);
        l2 = new Label();
        l2.setBounds(100,140,120,30);

        add(l);
        add(l2);
        setSize(300,400);
        setLayout(null);
        setVisible(true);

        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e)
    {
        l.setText("Key Typed "+e.getKeyChar());
    }
    public void keyReleased(KeyEvent e)
    {
        l2.setText("Released");
    }
    public void keyTyped(KeyEvent e)
    {     
    }
    public static void main(String[] args) {
        new KeyDemo();
    }
    
}