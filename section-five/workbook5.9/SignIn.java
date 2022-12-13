import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = "doinyne";
        String password = "java";

        System.out.println("Welcome to Javagram! Sign in below");


        System.out.print("- Username: ");
        String usernameInput = scan.nextLine();

        System.out.print("- Password: ");
        String passwordInput = scan.nextLine();

        while(!usernameInput.equals(username) || !passwordInput.equals(password)) {
            System.out.println("Incorrect, please try again!");

            System.out.print("- Username: ");
            usernameInput = scan.nextLine();
            System.out.print("- Password: ");
            passwordInput = scan.nextLine();
        }
        System.out.println("Sign in successful. Welcome!");
        scan.close();
    }
}