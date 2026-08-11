package packages2;

import java.util.Scanner;

public class LearnInputClass {

    public static void main(String[] args) {
        
        Car obj = new Car();
        obj.getDetails();
        obj.carData();
    }
    
}

class Car {

    String name;
    String model;
    int price;
    int number;

    Scanner sc = new Scanner(System.in);

    void getDetails() {
        System.out.print("Enter car name : ");
        name = sc.nextLine();
        System.out.print("Enter car model : ");
        model = sc.next();
        System.out.print("Enter car price : ");
        price = sc.nextInt();
        System.out.print("Enter car number : ");
        number = sc.nextInt();
    }

    void carData() { 
        System.out.println("Car name : "+name);
        System.out.println("Car model : "+model);
        System.out.println("Car price : "+price);
        System.out.println("Car number : "+number);
    }
}