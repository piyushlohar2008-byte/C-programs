package packages2;

public class learnInterface implements watch{

    
    @Override
    public void watchDetails() {
        System.out.println("--- Watch data ---");
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'watchDetails'");

        System.out.println("Watch name : "+Wname);
        System.out.println("Price : "+price+"$");
    }

    @Override
    public void mobileData() {
        System.out.println("--- Mobile data ---");
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'mobileData'");

        System.out.println("Mobile name : "+Mname);
        System.out.println("Operating system : "+os.toLowerCase());
        System.out.println("Ram : "+ram+"GB");
    }

    @Override
    public void details() {
        System.out.println("--- Computer data ---");
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'details'");

        System.out.println("Computer name : "+Cname);
        System.out.println("Outer parts : "+parts.toLowerCase());
        System.out.println("Operating system : "+ops.toLowerCase());
        
    }

    public static void main(String[] args) {
        
        learnInterface obj = new learnInterface();
        obj.details();
        System.out.println();
        obj.mobileData();
        System.out.println();
        obj.watchDetails();
    }
    
    
}

interface computer{
    final String Cname = "ACER";
    final String parts = "CPU, MOUSE, KEYBOARD, MONITOR";
    final String ops = "WINDOWS 10";
    public void details();
}

interface mobile extends computer{
    String Mname = "VIVO";
    String os = "ANDROID";
    int ram = 12;
    void mobileData();
    
}

interface watch extends mobile{
    String Wname = "APPLE";
    int price = 4500;
    void watchDetails();
}

// class access {

//     int no;
//     void Number(int no){
//         this.no = no;
//     }
// }