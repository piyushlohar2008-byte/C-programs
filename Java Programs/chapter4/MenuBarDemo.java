import java.awt.*;

public class MenuBarDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        MenuBar mb = new MenuBar();
        Menu files = new Menu("Files");
        Menu edit = new Menu("Format");

        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");

        MenuItem bold = new MenuItem("Bold");
        MenuItem italic = new MenuItem("Italic");

        edit.add(bold);
        edit.add(italic);
        files.add(open);
        files.add(save);
        files.add(exit);

        mb.add(files);
        mb.add(edit);

        f.setMenuBar(mb);
        f.setSize(500,600);
        f.setVisible(true);
    }
}