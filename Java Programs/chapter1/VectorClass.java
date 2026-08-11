import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        System.out.println(v);
        System.out.println(v.contains(50));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.capacity());
        v.remove(20);
        v.reversed();
        System.out.println(v);
        
    }
}