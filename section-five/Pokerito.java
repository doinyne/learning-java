import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String computerCard = randomNumber();
        System.out.println("Computer card: \n" + computerCard);

        String playerCard = randomNumber();
        System.out.println("Player card: \n" + playerCard);

        System.out.println("Now the dealer will deal 5 cards. Press enter to continue");
        scan.nextLine(); // if statement for enter once next function has been created


        String dealerCard1 = randomNumber();
        String dealerCard2 = randomNumber();
        String dealerCard3 = randomNumber();
        String dealerCard4 = randomNumber();
        String dealerCard5 = randomNumber();
        System.out.println("Dealers cards: \n" + dealerCard1 + dealerCard2 + dealerCard3 + dealerCard4 + dealerCard5);

        int playerCardPoints = 0;
        int computerCardPoints = 0;

        if(playerCard.equals(dealerCard1) ||
                playerCard.equals(dealerCard2) ||
                playerCard.equals(dealerCard3) ||
                playerCard.equals(dealerCard4) ||
                playerCard.equals(dealerCard5))
        {
            playerCardPoints += 1;
        }
        if(computerCard.equals(dealerCard1) ||
                computerCard.equals(dealerCard2) ||
                computerCard.equals(dealerCard3) ||
                computerCard.equals(dealerCard4) ||
                computerCard.equals(dealerCard5))
        {
            computerCardPoints += 1;
        }

        System.out.println("Player points: " + playerCardPoints);
        System.out.println("Computer points: " + computerCardPoints);
        scan.close();
    }

    public static String randomNumber() {
        double randomDouble = Math.random() * 13 + 1;
        int randomInt = (int)randomDouble;

        String randomCard;

        switch(randomInt) {
            case 1: randomCard = "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
                break;
            case 2:
                randomCard = "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";
                break;
            case 3:
                randomCard = "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";
                break;
            case 4:
                randomCard = "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";
                break;
            case 5:
                randomCard = "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
                break;
            case 6:
                randomCard = "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
                break;
            case 7:
                randomCard = "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
                break;
            case 8:
                randomCard = "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
                break;
            case 9:
                randomCard = "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
                break;
            case 10:
                randomCard = "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
                break;
            case 11:
                randomCard = "   _____ \n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
                break;
            case 12:
                randomCard = "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
                break;
            case 13:
                randomCard = "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";
                break;
            default: randomCard = "Sorry error";
            break;
        }
        return randomCard;
    }



}