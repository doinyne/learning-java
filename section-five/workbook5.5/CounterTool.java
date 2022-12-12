import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes?");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.println("1. Pick a number to count by: ");
        int countBy = scan.nextInt();
        scan.nextLine();

        System.out.println("2. Pick a number to start counting from: ");
        int countFrom = scan.nextInt();
        scan.nextLine();

        System.out.println("3. Pick a number to count to: ");
        int countTo = scan.nextInt();
        scan.nextLine();

        for(int i = countFrom; i <= countTo; i += countBy) {
            System.out.print(i + " ");
        }
    }
}
