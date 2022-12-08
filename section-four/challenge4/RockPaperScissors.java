import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(computerChoice());

    System.out.println("Let's play Rock Paper Scissors.\nWhen I say 'shoot', choose: rock, paper or scissors!\nAre you ready? Write 'yes' if you are");
    
    String answer = scan.nextLine();
    
    if(answer.equals("yes")) {
      System.out.println("Great!\nrock - paper - scissors, shoot!");
    } else {
      System.out.println("Darn, some other time...!");
    }

    String userWeapon = scan.nextLine();

    scan.close();
  }

  public static String computerChoice() {
    double randomNumber = Math.random() * 3;
    randomNumber += 1;
    // String computerWeapon;

    switch(randomNumber) {
      case 1: return "rock";
      case 2: return "paper";
      case 3: return "scissors";
      default: return "error";
    }

  }

}
