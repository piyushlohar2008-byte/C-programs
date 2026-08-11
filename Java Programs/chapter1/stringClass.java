public class stringClass {
    public static void main(String[] args) {
        String s1 = new String("Python");
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.concat(" language"));
        System.out.println(s1.endsWith("n"));

        String s2 = new String("Piyush");
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.replace("Piyush","Aniket"));
        System.out.println(s2.contains(s1));
        System.out.println(s2.equals(s1));
        
        String s3 = new String("This is the end ");
        System.out.println(s3.repeat(3));
        System.out.println(s3.compareToIgnoreCase(s2));
    }
}