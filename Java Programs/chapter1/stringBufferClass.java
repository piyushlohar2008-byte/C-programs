public class stringBufferClass {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Java");
        System.out.println(s1.insert(4, " is best"));
        System.out.println(s1.append(" pragramming language"));
        System.out.println(s1.delete(7, 12));

        StringBuffer s2 = new StringBuffer("Hello World");
        System.out.println(s2.length());
        System.out.println(s2.charAt(2));
        System.out.println(s2.indexOf("W"));
        System.out.println(s2.capacity());

        StringBuffer s3 = new StringBuffer("MSBTE");
        System.out.println(s3.substring(0,3));
        System.out.println(s3.reverse());
        System.out.println(s3.isEmpty());
    }   
}