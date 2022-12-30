import java.util.Scanner;

public class BlackJack {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        //welcome message
        System.out.println("\nWelcome to Deano Casino!");
        System.out.println("You have selected to play BlackJack!");
        System.out.println("...press anything to begin!");
        scan.nextLine();

        String upsideDownCard = """
                       _____
                      |     |
                      | DD  |
                      | D D |
                      | DD  |
                      |_____|
                    """;

        //player cards
        int playerCard1 = randomCards();
        int playerCard2 = randomCards();
        System.out.println("You get a \n" + cardString(playerCard1) + "And a \n" + cardString(playerCard2));

        //player total
        int playerTotal = Math.min(playerCard1, 10) + Math.min(playerCard2, 10);
        System.out.println("Your total is: " + playerTotal);

        //dealer cards
        int dealerCard1 = randomCards();
        int dealerCard2 = randomCards();
        System.out.println("Dealer shows a \n" + cardString(playerCard1) + "And has a card facing down \n" + upsideDownCard);

        //dealer total
        int dealerTotal = Math.min(dealerCard1, 10) + Math.min(dealerCard2, 10);

        //game logic
        while (true) {
            String option = stickOrTwist();

            if(option.equalsIgnoreCase("stick")) {
                break;
            }

            int newCard = randomCards();
            playerTotal += Math.min(newCard, 10);
            System.out.println("\nYou get a\n" + cardString(newCard));
            System.out.println("Your total is " + playerTotal);

            if(playerTotal > 21) {
                System.out.println("You bust!");
                System.exit(0);
            }
        }

        System.out.println("\nThe dealer's cards are \n" + cardString(dealerCard1) + "\n and a \n" + cardString(dealerCard2));

        while(dealerTotal <= 17) {
            int newCard = randomCards();

            dealerTotal += Math.min(newCard, 10);
            System.out.println("\nDealer gets a \n" + cardString(newCard));
            System.out.println("Dealers total is " + dealerTotal);
        }

        if(dealerTotal > 21) {
            System.out.println("Dealer bust!");
            System.exit(0);
        }

        if(playerTotal > dealerTotal) {
            System.out.println("You win!");
        } else {
            System.out.println("Dealer wins!");
        }

        scan.close();
    }

    public static int randomCards() {
        double randomInt = Math.random() * 13 + 1;
        return (int)randomInt;
    }

    public static String cardString(int randomCards) {
        return switch (randomCards) {
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

    public static String stickOrTwist() {
        System.out.println("Would you like to stick or twist?");
        String response = scan.nextLine();

        while(!(response.equalsIgnoreCase("twist") || response.equalsIgnoreCase("stick"))) {
            System.out.println("Please type 'stick' or 'twist'");
            response = scan.nextLine();
        }
        return response;
    }

}


