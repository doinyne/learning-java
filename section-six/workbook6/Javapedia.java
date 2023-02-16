import java.util.Scanner;
import java.util.*;

public class Javapedia {
    public static void main(String[] args) {



    }

    public static void enterInfo(String[][] array) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        int userInput = scan.nextInt();
        scan.nextLine();

        String[][] database = new String[userInput][3];

        enterInfo(database);

        scan.close();

        int figureNumber = 1;

        String[] newArray = new String[array.length];
        System.out.println(Arrays.deepToString(array));

        for(int i = 0; i <= array.length -1; i++) {

            for(int j = 0; j <= userInput; j++) {

                System.out.println("Figure " + figureNumber++);

                System.out.print("Name > ");
                String Name = scan.nextLine();
                newArray[j] = Name;

                System.out.print("DOB > ");
                String dob = scan.nextLine();
                newArray[j] = dob;

                System.out.print("Occupancy: ");
                String occupancy = scan.nextLine();
                newArray[j] = occupancy;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}

