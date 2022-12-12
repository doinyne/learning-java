import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        System.out.println("What would you like to repeat?");

        String repeat = scan.nextLine();

        for(int i = 0; i < 99; i++) {
            count += 1;
            System.out.println(count + ". " + repeat);
        }

        scan.close();
    }
}