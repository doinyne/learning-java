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

    
    String computerWeapon = computerChoice();
    String userWeapon = scan.nextLine();

    System.out.println("You chose: " + userWeapon);
    System.out.println("The computer chose: " + computerChoice());    
    String result = result(userWeapon, computerWeapon);
    System.out.println(result); 

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

  public static String result(String userWeapon, String computerChoice) {
    String result = "";
    if(userWeapon.equals("rock") && computerChoice.equals("scissors")) {
      result = "You win!";
    } else if (userWeapon.equals("rock") && computerChoice.equals("paper")) {
      result = "Computer wins!";
    } else if (userWeapon.equals("paper") && computerChoice.equals("rock")) {
      result = "You win!";
    } else if (userWeapon.equals("paper") && computerChoice.equals("scissors")) {
      result = "Computer wins!";
    } else if (computerChoice.equals("scissors") && userWeapon.equals("paper")) {
      result = "You win!";
    } else if (computerChoice.equals("scissors") && userWeapon.equals("rock")) {
      result = "Computer wins!";
    } else if (userWeapon == computerChoice){
      result = "Its a draw";
    } else {
      System.out.println("Invaid option");
      System.exit(0);
    }
    return result;
  }
}
