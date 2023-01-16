import java.util.Arrays;
import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings would you like?");
        int toppingsAmount = scan.nextInt();
        scan.nextLine();
        String[] toppings = new String[toppingsAmount];
        System.out.println("Great, enter each topping");
        for(int i = 0; i < toppingsAmount; i++){
            System.out.print(i + ". ");
            toppings[i] = scan.nextLine();
        }
        System.out.println("Thank you, here are the toppings you ordered: ");
        for(int i = 0; i < toppings.length; i++) {
            System.out.println(i + ". " + toppings[i]);
        }
        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();
    }
}


