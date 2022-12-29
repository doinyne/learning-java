import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //player cards
        String playerCard1 = randomCards();
        System.out.println("You get a \n" + playerCard1);
        String playerCard2 = randomCards();
        System.out.println("And a \n" + playerCard2);
        int playerHand = cardNumber(playerCard1) + cardNumber(playerCard2);
        String playerCard3 = randomCards();
        String playerCard4 = randomCards();
        String playerCard5 = randomCards();

        String dealerCard1 = randomCards();
        String dealerCard2 = randomCards();
        String dealerCard3 = randomCards();
        String dealerCard4 = randomCards();
        String dealerCard5 = randomCards();

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
            System.out.println("You have: " + (playerHand + cardNumber(playerCard3)));
            System.out.println("s or t?");
        } else {
            System.out.println("You stuck with: " + playerHand);
            System.out.println("The Dealer has: " + (cardNumber(dealerCard1) + cardNumber(dealerCard2)));
            dealerHand(dealerCard1, dealerCard2, dealerCard3, dealerCard4, dealerCard5);
        }

        String stickOrTwist2 = scan.nextLine();

        if(stickOrTwist2.equals("t")) {
            System.out.println("You got a \n" + playerCard4);
            System.out.println("You have: " + (playerHand + cardNumber(playerCard3) + cardNumber(playerCard4)));
            System.out.println("s or t?");
        } else {
            System.out.println("You stuck with: " + (playerHand + cardNumber(playerCard3)));
            dealerHand(dealerCard1, dealerCard2, dealerCard3, dealerCard4, dealerCard5);
        }

        String stickOrTwist3 = scan.nextLine();

        if(stickOrTwist3.equals("t")) {
            System.out.println("You got a \n" + playerCard5);
            System.out.println("You have: " + (playerHand + cardNumber(playerCard3) + cardNumber(playerCard4) + cardNumber(playerCard5)));
            System.out.println("s or t?");
        } else {
            System.out.println("You stuck with: " + (playerHand + cardNumber(playerCard3) + cardNumber(playerCard4)));
            dealerHand(dealerCard1, dealerCard2, dealerCard3, dealerCard4, dealerCard5);
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

    public static int cardNumber(String randomCards) {

        int cardWorth = switch (randomCards) {
            case """
                       _____
                      |A _  |
                      | ( ) |
                      |(_'_)|
                      |  |  |
                      |____V|
                    """ -> 1;
            case """
                       _____
                      |2    |
                      |  o  |
                      |     |
                      |  o  |
                      |____Z|
                    """ -> 2;
            case """
                       _____
                      |3    |
                      | o o |
                      |     |
                      |  o  |
                      |____E|
                    """ -> 3;
            case """
                       _____
                      |4    |
                      | o o |
                      |     |
                      | o o |
                      |____h|
                    """ -> 4;
            case """
                       _____\s
                      |5    |
                      | o o |
                      |  o  |
                      | o o |
                      |____S|
                    """ -> 5;
            case """
                       _____\s
                      |6    |
                      | o o |
                      | o o |
                      | o o |
                      |____6|
                    """ -> 6;
            case """
                       _____\s
                      |7    |
                      | o o |
                      |o o o|
                      | o o |
                      |____7|
                    """ -> 7;
            case """
                       _____\s
                      |8    |
                      |o o o|
                      | o o |
                      |o o o|
                      |____8|
                    """ -> 8;
            case """
                       _____\s
                      |9    |
                      |o o o|
                      |o o o|
                      |o o o|
                      |____9|
                    """ -> 9;
            case """
                       _____\s
                      |10  o|
                      |o o o|
                      |o o o|
                      |o o o|
                      |___10|
                    """, """
                               _____\s
                              |J  ww|
                              | o {)|
                              |o o% |
                              | | % |
                              |__%%[|
                            """, """
                                       _____
                                      |Q  ww|
                                      | o {(|
                                      |o o%%|
                                      | |%%%|
                                      |_%%%O|
                                    """, """
                                               _____
                                              |K  WW|
                                              | o {)|
                                              |o o%%|
                                              | |%%%|
                                              |_%%%>|
                                            """ -> 10;
            default -> 0;
        };
        return cardWorth;
    }

    public static void dealerHand(String dealerCard1, String dealerCard2, String dealerCard3, String dealerCard4, String dealerCard5) {
        if((cardNumber(dealerCard1) + cardNumber(dealerCard2)) <= 17) {
            System.out.println("The Dealer has: " + (cardNumber(dealerCard1) + cardNumber(dealerCard2) + cardNumber(dealerCard3)));
            if((cardNumber(dealerCard1) + cardNumber(dealerCard2) + cardNumber(dealerCard3)) <= 17) {
                System.out.println("The Dealer has: " + (cardNumber(dealerCard1) + cardNumber(dealerCard2) + cardNumber(dealerCard3) + cardNumber(dealerCard4)));
            } else {
                System.out.println("The Dealer has: " + (cardNumber(dealerCard1) + cardNumber(dealerCard2) + cardNumber(dealerCard3)));
            }
        } else {
            System.out.println("The Dealer has: " + (cardNumber(dealerCard1) + cardNumber(dealerCard2)));
        }
        System.exit(0);
    }

}


