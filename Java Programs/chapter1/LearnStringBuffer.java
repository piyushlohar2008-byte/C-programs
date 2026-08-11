package packages2;

public class LearnStringBuffer {

    public static void main(String[] args) {
        
        StringBuffer str1 = new StringBuffer("Object_Language");
        str1.setCharAt(6, ' ');
        System.out.println("String = "+str1);

        StringBuffer str2 = new StringBuffer("Object Language");
        System.out.println("Append string = "+str2.append(" is secured"));

        StringBuffer str3 = new StringBuffer("Object Language");
        System.out.println("New string = "+str3.insert(7, "Oriented "));

        StringBuffer str4 = new StringBuffer("Object");
        System.out.println("Length of string = "+str4.length());

        str4.setLength(10);
        System.out.println("new length = "+str4.length());

        StringBuffer str5 = new StringBuffer("PIYUSH");
        System.out.println("Reverse string = "+str5.reverse());

        StringBuffer str6 = new StringBuffer("PIYUSH");
        System.out.println("Replace string = "+str6.replace(0, 6, "ANIKET"));

    
    }
    
}

// output-
// String = Object Language
// Append string = Object Language is secured
// New string = Object Oriented Language
// Length of string = 6
// new length = 10
// Reverse string = HSUYIP
// Replace string = ANIKET