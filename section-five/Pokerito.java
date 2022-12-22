import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String computerCard = randomCards();
        String playerCard = randomCards();
        int playerCardPoints = 0;
        int computerCardPoints = 0;

        System.out.println("Computer card: \n" + computerCard);
        System.out.println("Player card: \n" + playerCard);
        System.out.println("Now the dealer will deal 5 cards. Press enter to continue");

        for(int i = 1; i <= 5; i++) {
            scan.nextLine();
            String dealerCard = randomCards();
            System.out.println("Dealer card: " + i + "\n" + dealerCard);
            if(playerCard.equals(dealerCard)) {
                playerCardPoints += 1;
            }
            if(computerCard.equals(dealerCard))
            {
                computerCardPoints += 1;
            }
        }

        System.out.println("Player number of matches: " + playerCardPoints);
        System.out.println("Computer number of matches: " + computerCardPoints);

        if(playerCardPoints > computerCardPoints) {
            System.out.println("Player wins!");
        } else if(playerCardPoints == computerCardPoints) {
            System.out.println("Everybody wins!");
        } else {
            System.out.println("Computer wins!");
        }

        scan.close();
    }

    public static String randomCards() {
        double randomDouble = Math.random() * 13 + 1;
        int randomInt = (int)randomDouble;

        return switch (randomInt) {
            case 1 -> """
                       _____
                      |A _  |
                      | ( ) |
                      |(_'_)|
                      |  |  |
                      |____V|
                    """;
            case 2 -> """
                       _____
                      |2    |
                      |  o  |
                      |     |
                      |  o  |
                      |____Z|
                    """;
            case 3 -> """
                       _____
                      |3    |
                      | o o |
                      |     |
                      |  o  |
                      |____E|
                    """;
            case 4 -> """
                       _____
                      |4    |
                      | o o |
                      |     |
                      | o o |
                      |____h|
                    """;
            case 5 -> """
                       _____\s
                      |5    |
                      | o o |
                      |  o  |
                      | o o |
                      |____S|
                    """;
            case 6 -> """
                       _____\s
                      |6    |
                      | o o |
                      | o o |
                      | o o |
                      |____6|
                    """;
            case 7 -> """
                       _____\s
                      |7    |
                      | o o |
                      |o o o|
                      | o o |
                      |____7|
                    """;
            case 8 -> """
                       _____\s
                      |8    |
                      |o o o|
                      | o o |
                      |o o o|
                      |____8|
                    """;
            case 9 -> """
                       _____\s
                      |9    |
                      |o o o|
                      |o o o|
                      |o o o|
                      |____9|
                    """;
            case 10 -> """
                       _____\s
                      |10  o|
                      |o o o|
                      |o o o|
                      |o o o|
                      |___10|
                    """;
            case 11 -> """
                       _____\s
                      |J  ww|
                      | o {)|
                      |o o% |
                      | | % |
                      |__%%[|
                    """;
            case 12 -> """
                       _____
                      |Q  ww|
                      | o {(|
                      |o o%%|
                      | |%%%|
                      |_%%%O|
                    """;
            case 13 -> """
                       _____
                      |K  WW|
                      | o {)|
                      |o o%%|
                      | |%%%|
                      |_%%%>|
                    """;
            default -> "Sorry error";
        };
    }



}