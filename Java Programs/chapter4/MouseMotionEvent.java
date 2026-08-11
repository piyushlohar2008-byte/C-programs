import java.awt.event.*;
import java.awt.*;

public class MouseMotionEvent implements MouseMotionListener {

    Label l;
    MouseMotionEvent()
    {
        Frame f = new Frame("Mouse Motion Event");
        l = new Label();
        l.setBounds(100,100,100,30);
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        f.addMouseMotionListener(this);
    }
    public void mouseMoved(MouseEvent e)
    {
        l.setText("Mouse Moved");
    }
    public void mouseDragged(MouseEvent e)
    {
        l.setText("Mouse Dragged");
    }
    public static void main(String[] args) 
    {
        new MouseMotionEvent();    
    }
}