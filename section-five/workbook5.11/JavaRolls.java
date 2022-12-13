import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great! Here are the rules:\n- If you roll a 6, the game stops.\n- If you roll a 4, nothing happens.\n- Otherwise, you get 1 point.\n You must collect at least 3 points to win. Enter anything to roll:");
        scan.nextLine();
        int points = 0;

        int dice = rollDice();

        if(dice == 1 || dice == 2 || dice == 3 || dice == 5) {
            points += 1;
            System.out.println("You rolled a " + dice + ". One point. Keep rolling");
        } else {
            System.out.println("You rolled a " + dice + ". Zero points. Keep rolling");
        }

        while(dice != 6) {
            dice = rollDice();
        }
        System.out.println("You rolled a 6. End of game.\nYou scored: " + (points));

    }

    public static int rollDice() {
        double randomDouble = Math.random() * 6 + 1;
        return (int)randomDouble;
    }
}