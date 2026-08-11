package operation;

public class Cricket extends Football implements InnerCricket{

    public void display()
    {
        System.out.println("Hello world");
    }
    
    public static void main(String[] args) {

        Cricket obj = new Cricket();
        obj.get_plr(11);
        obj.display();
        System.out.println("Area of football : "+InnerCricket.arr);
        
    }

    @Override
    public String toString() {
        return "Cricket []";
    }
}

class Football{
    int player;

    void get_plr(int plr){
        player = plr;
    }
    void put_plr(){
        System.out.println("Their are "+player+" play in football");
    }
}

interface InnerCricket {

    final float arr = 80.90f;
}