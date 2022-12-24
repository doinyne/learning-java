import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String playerCard1 = randomCards();
        System.out.println("You get a \n" + playerCard1);
        String playerCard2 = randomCards();
        System.out.println("And a \n" + playerCard2);

        String dealerCard1 = randomCards();
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
            String playerCard3 = randomCards();
            System.out.println("You got a \n" + playerCard3);
        } else {
            System.out.println("You stuck");
        }


        System.out.println(cardNumber(playerCard1) + cardNumber(playerCard2));
//        System.out.println(cardNumber(playerCard2));
//        System.out.println(cardNumber(dealerCard1));

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
}
