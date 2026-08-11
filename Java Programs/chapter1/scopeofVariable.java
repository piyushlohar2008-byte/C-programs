

public class scopeofVariable {
    
    String book;
    int price;
    static int count;
    void getdata(String b,int p){
            book = b;
            price = p;
    }
    void input(){
        count++;
        System.out.println("Count : "+count);
    }
    void show(){
        System.out.println("Book : "+book);
        System.out.println("Price : "+price);
    }
    public static void main(String[] args) {
        
        scopeofVariable obj = new scopeofVariable();
        obj.getdata("Jungle_book", 4500);
        obj.input();
        obj.show();
        obj.input();
    }
}