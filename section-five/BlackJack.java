import java.util.Scanner;

public class BlackJack {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\nWelcome to Deano Casino!");
        System.out.println("You have selected to play BlackJack!");
        System.out.println("...press anything to begin!");
        scan.nextLine();

        //player cards
        int playerCard1 = randomCards();
        System.out.println("You get a \n" + playerCard1);
        int playerCard2 = randomCards();
        System.out.println("And a \n" + playerCard2);
        int playerHand = playerCard1 + playerCard2;
        int playerCard3 = randomCards();
        int playerCard4 = randomCards();
        int playerCard5 = randomCards();

        int dealerCard1 = randomCards();
        int dealerCard2 = randomCards();
        int dealerCard3 = randomCards();
        int dealerCard4 = randomCards();
        int dealerCard5 = randomCards();

        System.out.println("Dealer had a \n" + dealerCard1);

        String upsideDownCard = """
                       _____
                      |     |
                      | DD  |
                      | D D |
                      | DD  |
                      |_____|
                    """;
        System.out.println("and a card facing down \n" + upsideDownCard);

        System.out.println("Would you like to stick or twist?\nPlease type s for stick and t for twist");
        String stickOrTwist = scan.nextLine();

        if(stickOrTwist.equals("t")) {
            System.out.println("You got a \n" + playerCard3);
            System.out.println("You have: " + (playerHand + playerCard3));
            System.out.println("s or t?");
        } else {
            System.out.println("You stuck with: " + playerHand);
            System.out.println("The Dealer has: " + (dealerCard1 + dealerCard2));
            dealerHand(dealerCard1, dealerCard2, dealerCard3, dealerCard4, dealerCard5);
        }

        String stickOrTwist2 = scan.nextLine();

        if(stickOrTwist2.equals("t")) {
            System.out.println("You got a \n" + playerCard4);
            System.out.println("You have: " + (playerHand + playerCard3 + playerCard4));
            System.out.println("s or t?");
        } else {
            System.out.println("You stuck with: " + (playerHand + playerCard3));
            dealerHand(dealerCard1, dealerCard2, dealerCard3, dealerCard4, dealerCard5);
        }

        String stickOrTwist3 = scan.nextLine();

        if(stickOrTwist3.equals("t")) {
            System.out.println("You got a \n" + playerCard5);
            System.out.println("You have: " + (playerHand + playerCard3 + playerCard4 + playerCard5));
            System.out.println("s or t?");
        } else {
            System.out.println("You stuck with: " + (playerHand + playerCard3 + playerCard4));
            dealerHand(dealerCard1, dealerCard2, dealerCard3, dealerCard4, dealerCard5);
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


    public static void dealerHand(int dealerCard1, int dealerCard2, int dealerCard3, int dealerCard4, int dealerCard5) {
        if((dealerCard1 + dealerCard2) <= 17) {
            System.out.println("The Dealer has: " + (dealerCard1 + dealerCard2 + dealerCard3));
            if((dealerCard1 + dealerCard2 + dealerCard3) <= 17) {
                System.out.println("The Dealer has: " + (dealerCard1 + dealerCard2 + dealerCard3 + dealerCard4));
            } else {
                System.out.println("The Dealer has: " + (dealerCard1 + dealerCard2 + dealerCard3));
            }
        } else {
            System.out.println("The Dealer has: " + (dealerCard1 + dealerCard2));
        }
        System.exit(0);
    }

}


