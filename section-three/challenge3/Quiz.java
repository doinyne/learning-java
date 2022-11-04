import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int score = 0;

        System.out.println("Welcome to Java's Quiz");
        System.out.println("\nHere is your first question!");

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China" + "\n\tb) Ireland" + "\n\tc) Brazil" + "\n\td) Italy");
        String answer1 = scan.nextLine();

        if(answer1.equals("Brazil")) {
            score += 5;
        } else if(answer1.equals("c")) {
            score += 5;
        } else if(answer1.equals("brazil")) {
            score += 5;
        } else {
            score += 0;
        }

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus" + "\n\tb) Saturn" + "\n\tc) Mercury" + "\n\td) Mars");
        String answer2 = scan.nextLine();

        if(answer2.equals("Venus")) {
            score += 5;
        } else if(answer2.equals("a")) {
            score += 5;
        } else if(answer2.equals("venus")) {
            score += 5;
        } else {
            score += 0;
        }

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O" + "\n\tb) A" + "\n\tc) B" + "\n\td) AB-Negative");
        String answer3 = scan.nextLine();

        if(answer3.equals("AB-Negative")) {
            score += 5;
        } else if(answer3.equals("d")) {
            score += 5;
        } else if(answer3.equals("ab-negative")) {
            score += 5;
        } else {
            score += 0;
        }

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Wealsey" + "\n\tb) Hermione Granger" + "\n\tc) Draco Malfoy");
        String answer4 = scan.nextLine();

        if(answer4.equals("Ron Wealsey") || answer4.equals("Hermione Granger")) {
            score += 5;
        } else if(answer4.equals("a") || answer4.equals("b")) {
            score += 5;
        } else if(answer4.equals("ron wealsey") || answer4.equals("hermione granger")) {
            score += 5;
        } else {
            score += 0;
        }

        System.out.println("\nYour final score is: " + score + "/20");
        if(score > 15) {
            System.out.println("Wow, you know your stuff!");
        } else if(score <= 15 || score >= 5) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time");
        }
    }
}
