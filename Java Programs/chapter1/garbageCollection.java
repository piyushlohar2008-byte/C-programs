public class garbageCollection {
    public static void main(String[] args) {
        garbageCollection gb1 = new garbageCollection();
        garbageCollection gb2 = new garbageCollection();
        gb1 = null;
        gb2 = null;
        System.gc();
    }   
}