import java.util.Scanner;

public class chatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int javabotAge = 400;

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();

        System.out.println("\nHi " + name + "! I'm JavaBot. Where are you from?");
        String userLocation = scan.nextLine();

        System.out.println("\nI hear it's beautiful in " + userLocation + "! I'm from a place called Oracle!");

        System.out.println("\nHow old are you?");
        int userAge = scan.nextInt();

        scan.nextLine();

        System.out.println("\nSo you're " + userAge + ", cool! I'm " + javabotAge + " years old.");
        System.out.println("This means I'm " + (javabotAge / userAge) + " times older than you. \nEnough about me. What's your favourite language?");
        String favouriteLanguage = scan.nextLine();

        System.out.println(favouriteLanguage + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");

        scan.close();

    }    
}
