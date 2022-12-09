import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Let's play Rock Paper Scissors.");
    System.out.println("Are you ready? Write 'yes' if you are");
    
    String answer = scan.nextLine();
    
    if(answer.equals("yes")) {
      System.out.println("Great!\nWhen I say 'shoot', choose: rock, paper or scissors!");
      System.out.println("rock - paper - scissors, shoot!");
    } else {
      System.out.println("Darn, some other time...!");
    }

    

    String userWeapon = scan.nextLine();

    System.out.println("You chose: " + userWeapon);
    System.out.println("The computer chose: " + computerChoice());

    results(userWeapon, computerChoice());

    scan.close();
  }

  public static String computerChoice() {
    double randomDouble = Math.random() * 3;
    randomDouble += 1;
    int randomInt = (int)randomDouble;
    String computerWeapon = "";
    
    if(randomInt == 1) {
      computerWeapon += "rock";
    } else if(randomInt == 2) {
      computerWeapon += "paper";
    } else if(randomInt == 3){
      computerWeapon += "scissors";
    }
    return computerWeapon;
  }

  public static void results(String userWeapon, String computerChoice) {
    if(userWeapon.equals("rock") && computerChoice.equals("scissors")) {
      System.out.println("You win!");
    } else if (userWeapon.equals("paper") && computerChoice.equals("rock")) {
      System.out.println("You win!");
    } else if (userWeapon.equals("scissors") && computerChoice.equals("paper")) {
      System.out.println("You win!");
    } else if (computerChoice.equals("rock") && userWeapon.equals("scissors")) {
      System.out.println("Computer wins!");
    } else if (computerChoice.equals("paper") && userWeapon.equals("rock")) {
      System.out.println("Computer wins!");
    } else if (computerChoice.equals("scissors") && userWeapon.equals("paper")) {
      System.out.println("Computer wins!");
    } else if (userWeapon == computerChoice){
      System.out.println("It's a draw!");
    } else {
      System.out.println("Invaid option");
      System.exit(0);
    }
  }
}
