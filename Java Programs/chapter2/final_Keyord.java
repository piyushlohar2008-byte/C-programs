public class final_Keyord {
    public static void main(String[] args) {
        Array a = new Array();
        a.perform();
        final float PI = 3.1415f;
        // final variable cannot be modify or changed
        // PI++;
        System.out.println(PI);
    }
}

// final method cannot be inherited 
final class Array {
    // final method cannot be override
    final void perform() {
        String arr[] = {"Piyush","Aditya","Aryan","Raj"};
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        
        int arr2[] = new int[3];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        for (int i = 0; i < 3; i++) {
            System.out.println(arr2[i]);
        }
    } 
}