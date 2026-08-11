import javax.swing.*;

public class JComboDemo extends JFrame{

    JComboDemo()
    {
        setLayout(null);
        setSize(300,400);
        setTitle("JComboDemo");
        String country[] = {"India","Russia","USA","Iran","France"};
        JComboBox<String> jc = new JComboBox<>(country);
        jc.setBounds(100,100,80,25);
        add(jc);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JComboDemo();
    }
}