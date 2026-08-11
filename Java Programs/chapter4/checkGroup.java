import java.awt.*;

public class checkGroup extends Frame{

    Checkbox c1,c2;
    CheckboxGroup cg;
    checkGroup() {
        setLayout(null);
        setVisible(true);
        setTitle("CheckboxGroup");
        setSize(400,400);
        cg = new CheckboxGroup();
        c1 = new Checkbox("JavaScript",false,cg);
        c2 = new Checkbox("Swift",false,cg);
        c1.setBounds(90,80,70,70);
        c2.setBounds(240,80,70,70);
        add(c1);
        add(c2);
    }
    public static void main(String[] args) {
        checkGroup c = new checkGroup();

    }
}