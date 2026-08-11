package packages2;

import java.util.Vector;

public class VectorsString {

    public static void main(String[] args) {
        
        Vector<String> v = new Vector<>();

        v.add("Iron man");
        v.add("Scarlet witch");
        v.add("Thor");
        v.add("Black widow");
        v.add("Hulk");

        System.out.println("Vectors : "+v);
        System.out.println("Indexs : "+v.get(1));
        v.remove(3);
        System.out.println(v);
        System.out.println(v.contains("Thor"));
    }
    
}