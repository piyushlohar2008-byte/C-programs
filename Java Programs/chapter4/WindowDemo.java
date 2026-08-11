import java.awt.*;

public class WindowDemo{

    public static void main(String[] args) {
        Frame f = new Frame("Windows");
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        Window w = new Window(f);
        w.setSize(300, 400);
        w.setVisible(true);
    }
    
}