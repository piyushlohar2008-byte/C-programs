package packages2;

import java.util.Vector;

public class LearnVector {

    public static void main(String[] args) {
        
        Vector<Integer> v = new Vector<>(1,7);

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        System.out.println("Vectors : "+v);
        System.out.println("Index of 2 : "+v.get(2));
        System.out.println("Contains : "+v.contains(6));
        System.out.println(v.contains(5));
        v.remove(3);
        System.out.println("Size : "+v.size());
        System.out.println("Capacity : "+v.capacity());


    }
    
}