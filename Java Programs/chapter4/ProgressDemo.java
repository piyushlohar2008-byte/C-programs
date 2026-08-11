import java.awt.*;
import javax.swing.*;

public class ProgressDemo extends JFrame{

    int i = 0;
    JProgressBar jp;
    ProgressDemo()
    {
        jp = new JProgressBar(0, 100);
        jp.setBounds(100,100,200,40);
        jp.setStringPainted(true);
        jp.setValue(0);
        jp.setForeground(Color.PINK);
        add(jp);
        setSize(400,500);
        setLayout(null);
        setVisible(true);

    }
    public void run()
    {
        while(i <= 100)
        {
            jp.setValue(i);
            i+=1;
            if (i == 100)
        {
            JTextArea JA = new JTextArea("Download successfully...");
            JA.setBounds(120,180,180,40);
            JA.setForeground(Color.RED);
            JA.setFont(new Font("Times New Romes", Font.BOLD,15));
            add(JA, BorderLayout.CENTER);
            revalidate();
            repaint();
        }
        try 
        {
            Thread.sleep(150);
        }
        catch(Exception e)
        {

        }
        }
        
    }
    public static void main(String[] args) {
        ProgressDemo p1 = new ProgressDemo();
        p1.run();
    }
    
}