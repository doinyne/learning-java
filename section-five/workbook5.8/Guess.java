import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int computerChoice = 3;

        System.out.println("I chose a number between 1 & 5! try and guess it: ");
        int yourChoice = scan.nextInt();

        while(yourChoice != computerChoice) {
            System.out.println("Guess again: " + yourChoice);
            yourChoice = scan.nextInt();
        }

        System.out.println("You got it!");
        scan.close();
    }
}