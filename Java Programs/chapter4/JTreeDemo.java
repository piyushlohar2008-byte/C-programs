import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTreeDemo extends JFrame{

    JTree tree;
    JTreeDemo()
    {
        setLayout(new BorderLayout());
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(a);
        top.add(b);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        b.add(b3);

        tree = new JTree(top);
        // JScrollPane jsp = new JScrollPane(tree);
        add(tree, BorderLayout.CENTER);
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTreeDemo();
    }
    
}