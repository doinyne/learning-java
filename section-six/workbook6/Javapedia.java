import java.util.Scanner;
import java.util.*;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        int userInput = scan.nextInt();
        scan.nextLine();

        String[][] database = new String[userInput][3];
        System.out.println(Arrays.deepToString(database));
        System.out.println("database index 0 length = " + database[0].length);
        System.out.println("database array length = " + database.length);

        enterInfo(database);

        scan.close();
    }

    public static void enterInfo(String[][] array) {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i <= array.length; i++) { //3
            for(int j = 0; j < array[i].length; j++) { // user input
                array[i][j] = scan.nextLine();
            }
            System.out.println("\n");
        }
        System.out.println(Arrays.deepToString(array));
    }
}
