import javax.swing.*;

public class JTabbedPaneDemo extends JFrame{

    JTabbedPaneDemo()
    {
        JTabbedPane jp1 = new JTabbedPane();
        jp1.addTab("Languages", new LangPanel());
        jp1.addTab("Colors",new ColorPanel());
        jp1.addTab("Favors", new FavorsPanel());
        add(jp1);
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    public static void main(String[] args) {
        
        new JTabbedPaneDemo();
    }
}

class LangPanel extends JPanel {

    public LangPanel()
    {
        JButton jb1 = new JButton("Marathi");
        JButton jb2 = new JButton("Hindi");
        JButton jb3 = new JButton("English");
        add(jb1);
        add(jb2);
        add(jb3);
    }
}
class ColorPanel extends JPanel {

    public ColorPanel()
    {
        JCheckBox jc1 = new JCheckBox("Orange",true);
        JCheckBox jc2 = new JCheckBox("White",false);
        JCheckBox jc3 = new JCheckBox("Green",false);
        add(jc1);
        add(jc2);
        add(jc3);
    }
}
class FavorsPanel extends JPanel {

    public FavorsPanel()
    {
        JComboBox jb1 = new JComboBox();
        jb1.addItem("Vanilla");
        jb1.addItem("Chocolate");
        jb1.addItem("Strawberry");
        add(jb1);
    }
}