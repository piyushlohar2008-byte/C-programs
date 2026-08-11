
import java.awt.*;

public class buttonsinjava extends Frame{

    
    buttonsinjava() {
        Button ok, cancel;
        Panel p = new Panel();
        p.setBounds(10,10,400,400);
        p.setBackground(Color.ORANGE);
        setTitle("Buttons");
        setLayout(null);
        setSize(400,400);
        setVisible(true);
        ok = new Button("Ok");
        cancel = new Button("Cancel");
        ok.setBounds(50,100,80,50);
        cancel.setBounds(150,100,80,50);
        
        try {
        Thread.sleep(2000);
        add(ok);
        Thread.sleep(2000);
        add(cancel);
        add(p);
        
        }
        catch(Exception e) {
    
        }
       
    }

    public static void main(String[] args) throws Exception{
        buttonsinjava b = new buttonsinjava();
    }

}