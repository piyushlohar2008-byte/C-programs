import java.awt.*;
import java.awt.event.*;

public class MouseClicked extends Frame{

    MouseClicked()
    {
        setSize(400,500);
        setLayout(null);
        addMouseListener(new MyMouseAdapter(this));
        setVisible(true);
    }
    public static void main(String[] args) {
        new MouseClicked();
    }
}

class MyMouseAdapter extends MouseAdapter 
{
    MouseClicked adapterDemo;
    MyMouseAdapter(MouseClicked adapterDemo)
        {
            this.adapterDemo = adapterDemo;
    }
    public void MouseClicked(MouseEvent me)
    {
        adapterDemo.setBackground(Color.BLACK);
        Label l = new Label();
        l.setText("Mouse Clicked");
        l.setBounds(100,100,100,50);
        adapterDemo.add(l);
        adapterDemo.repaint();
    }
}