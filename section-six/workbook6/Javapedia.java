import java.util.Scanner;
import java.util.*;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        int userInput = scan.nextInt();
        scan.nextLine();

        String[][] database = new String[userInput][3];

        enterInfo(database);

//        System.out.println("Name: " + database[0][0]);
//        System.out.println("DOB: " + database[0][1]);
//        System.out.println("Occupancy: " + database[0][2]);


        scan.close();
    }

    public static void enterInfo(String[][] array) {
        Scanner scan = new Scanner(System.in);
        int figureNumber = 1;
        String[] newArray = new String[array.length];
        System.out.println(Arrays.deepToString(array));
        for(int i = 0; i <= array.length -1; i++) {
            newArray[i] = Arrays.toString(array[i]);
            System.out.println("Figure " + figureNumber++);
            System.out.print("Name > ");
            String Name = scan.nextLine();
            newArray[i] =
            System.out.print("DOB > ");
            String dob = scan.nextLine();
            System.out.print("Occupancy: ");
            String occupancy = scan.nextLine();
        }
        System.out.println(Arrays.deepToString(array));
    }
}
