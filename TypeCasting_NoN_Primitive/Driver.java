
package TypeCasting_NoN_Primitive;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Select option - ");
        System.out.println("1. Tata");
        System.out.println("2. Mahindra");
        System.out.println("3. Kia");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        Car car = null; // Upcasting

        switch (choice) {
            case 1:
                System.out.println("Tata car is getting ready!");
                car = new Tata();
                break;

            case 2:
                System.out.println("Mahindra car is getting ready!");
                car = new Mahindra();
                break;

            case 3:
                System.out.println("Kia car is getting ready!");
                car = new Kia();
                break;

            default:
                System.out.println("Invalid option");
        }

        if (car instanceof Tata) {
            Tata t = (Tata) car; // Downcasting
            System.out.println("Tata price: " + t.price);
        }
        else if (car instanceof Mahindra) {
            Mahindra m = (Mahindra) car; // Downcasting
            System.out.println("Mahindra price: " + m.price);
        }
        else if (car instanceof Kia) {
            Kia k = (Kia) car; // Downcasting
            System.out.println("Kia price: " + k.price);
        }

        sc.close();
    }
}
