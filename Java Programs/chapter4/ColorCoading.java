import java.awt.*;

public class ColorCoading extends Frame{
    
    Label l1, l2, l3, l4, l5;
    ColorCoading() throws Exception{
        setSize(350,500);
        setLayout(null);
        setVisible(true);
        setTitle("Number colors printing");
        l1 = new Label("1");
        l2 = new Label("2");
        l3 = new Label("3");
        l4 = new Label("4");
        l5 = new Label("5");
        l1.setBounds(150,100,80,40);
        l2.setBounds(150,140,80,40);
        l3.setBounds(150,180,80,40);
        l4.setBounds(150,220,80,40);
        l5.setBounds(150,260,80,40);
        l1.setFont(new Font("Arial",Font.CENTER_BASELINE,26));
        l2.setFont(new Font("Arial",Font.CENTER_BASELINE,26));
        l3.setFont(new Font("Arial",Font.CENTER_BASELINE,26));
        l4.setFont(new Font("Arial",Font.CENTER_BASELINE,26));
        l5.setFont(new Font("Arial",Font.CENTER_BASELINE,26));
        l1.setForeground(Color.ORANGE);
        l2.setForeground(Color.GREEN);
        l3.setForeground(Color.BLUE);
        l4.setForeground(Color.PINK);
        l5.setForeground(Color.black);

        try {
         
            add(l1);
            Thread.sleep(1000);
            add(l2);
            Thread.sleep(1000);
            add(l3);
            Thread.sleep(1000);
            add(l4);
            Thread.sleep(1000);
            add(l5);
            Thread.sleep(1000);   
            
        }
        catch(Exception e) {

        }
    }
    public static void main(String[] args) throws Exception{
        new ColorCoading();
    }
}