import java.awt.*;

public class gridBugDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.setTitle("GridBaglayout");
        d.setVisible(true);
        d.setSize(500,600);

    }
}

class Demo extends Frame {
    Demo()
    {
        setLayout(new GridBagLayout());
        Label l1 = new Label("Name");
        Label l2 = new Label("Password");
        Button b1 = new Button("Submit");
        TextField TF = new TextField(10);
        TextArea TA = new TextArea(6,15);
        GridBagConstraints gc = new GridBagConstraints();
        add(l1,gc,0);
        add(l2,gc,1);
        add(b1,gc,0);
        add(TF,gc,1);
        add(TA,gc,0);

    }
    void add(Component cp,GridBagConstraints gc,int x,int y,int w,int h,int wx,int wy ) 
    {
        gc.gridx = x;
        gc.gridy = y;
        gc.gridheight = h;
        gc.gridwidth = w;
        gc.weightx = wx;
        gc.weighty = wy;
        add(cp,gc);
    }
}