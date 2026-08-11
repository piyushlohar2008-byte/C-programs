public class ArrayIndexException {
    public static void main(String[] args) 
    {
        int arr[] = {10, 20, 30, 40, 50};
        try 
        {
            System.out.println(arr[6]);
        }
        catch(Exception e) 
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Array index out of bound exception");
        }
    }
}