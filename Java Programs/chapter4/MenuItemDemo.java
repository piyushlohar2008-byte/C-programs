import java.awt.*;

public class MenuItemDemo extends Frame{

    MenuItemDemo() throws Exception
    {
        setLayout(null);
        setVisible(true);
        setSize(350,450);
        setTitle("Menu Items");
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu color = new Menu("Colors");
        Menu fruits = new Menu("Fruits");
        Menu car = new Menu("Cars");
        Menu exit = new Menu("Exit");
        try {
            mb.add(color);
            Thread.sleep(1800);
            mb.add(fruits);
            Thread.sleep(1800);
            mb.add(car);
            Thread.sleep(1800);
            mb.add(exit);
        }
        catch(Exception e) {

        }
        color.add(new MenuItem("Orange"));
        color.addSeparator();
        color.add(new MenuItem("White"));
        color.addSeparator();
        color.add(new MenuItem("Green"));
        fruits.add(new MenuItem("Apple"));
        fruits.addSeparator();
        fruits.add(new MenuItem("Banana"));
        fruits.addSeparator();
        fruits.add(new MenuItem("Peru"));
        car.add(new MenuItem("BMW"));
        car.addSeparator();
        car.add(new MenuItem("Buggati"));
        car.addSeparator();
        car.add(new MenuItem("Pagani"));
    }
    public static void main(String[] args) throws Exception{
        new MenuItemDemo();
    }
    
}