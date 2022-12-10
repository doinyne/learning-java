import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Let's play Rock Paper Scissors.");
    System.out.println("Great!\nWhen I say 'shoot', choose: rock, paper or scissors!");
    System.out.println("Are you ready? Write 'yes' if you are");
    
    String answer = scan.nextLine();
    
    if(answer.equals("yes")) {
      System.out.println("rock - paper - scissors, shoot!");
    } else {
      System.out.println("Darn, some other time...!");
      System.exit(0);
    }
    
    String computerWeapon = computerChoice();
    String userWeapon = scan.nextLine();
    String result = result(userWeapon, computerWeapon);
    printResult(userWeapon, computerWeapon, result);

    scan.close();
  }

  public static String computerChoice() {
    double randomDouble = Math.random() * 3;
    int randomInt = (int)randomDouble;  
    switch(randomInt) {
      case 0: return "rock";
      case 1: return "paper";
      case 2: return "scissors";
      default: return "";
    }
  }

  public static String result(String userWeapon, String computerWeapon) {
    String result = "";
    if(userWeapon.equals("rock") && computerWeapon.equals("scissors")) {
      result = "You win!";
    } else if (userWeapon.equals("rock") && computerWeapon.equals("paper")) {
      result = "Computer wins!";
    } else if (userWeapon.equals("paper") && computerWeapon.equals("rock")) {
      result = "You win!";
    } else if (userWeapon.equals("paper") && computerWeapon.equals("scissors")) {
      result = "Computer wins!";
    } else if (userWeapon.equals("scissors") && computerWeapon.equals("paper")) {
      result = "You win!";
    } else if (userWeapon.equals("scissors") && computerWeapon.equals("rock")) {
      result = "Computer wins!";
    } else if (userWeapon.equals(computerWeapon)){
      result = "Its a draw";
    } else {
      System.out.println("Invaid option");
      System.exit(0);
    }
    return result;
  }

  public static void printResult(String userWeapon, String computerWeapon, String result) {
    System.out.println("You chose: " + userWeapon);
    System.out.println("The computer chose: " + computerWeapon);
    System.out.println(result);
  }
}
