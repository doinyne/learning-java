import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Let's play Rock Paper Scissors.\nWhen I say 'shoot', choose: rock, paper or scissors!\nAre you ready? Write 'yes' if you are");
    
    String answer = scan.nextLine();
    
    if(answer.equals("yes")) {
      System.out.println("Great!\nrock - paper - scissors, shoot!");
    } else {
      System.out.println("Thank you for checking out this game. Goodbye!");
    }
    scan.close();
  }

  public static void computerWeapon() {
    String[] anArrayOfWeapons;
    anArrayOfWeapons = new String[3];
    anArrayOfWeapons[0] = "rock ";
    anArrayOfWeapons[1] = "paper ";
    anArrayOfWeapons[2] = "scissors";
  }
}
