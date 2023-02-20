import java.util.Scanner;
import java.util.*;

public class Javapedia {
    public static void main(String[] args) {
        enterInfo();
    }

    public static void enterInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        int userInput = scan.nextInt();
        scan.nextLine();
        String[][] database = new String[userInput][3];
        System.out.println(Arrays.deepToString(database));

        for(int i = 0; i < database.length; i++) {
            System.out.println("Figure " + (i + 1));
            for(int j = 0; j < 1; j++) {
                System.out.print("* Name: ");
                database[i][0] = scan.nextLine();
                System.out.print("* dob: ");
                database[i][1] = scan.nextLine();
                System.out.print("* Occupation: ");
                database[i][2] = scan.nextLine();
            }

        }
        System.out.println("These are the values you stored: " + Arrays.deepToString(database));
        System.out.println(database.length);
        System.out.print("Would you like some more information? ");
        String userQuery = scan.nextLine();
        for(int i = 0; i < database.length; i++) {
            if(userQuery.equals(database[i][0])) {
                System.out.println(Arrays.toString(database[i]));
            }
        }
    }

}

