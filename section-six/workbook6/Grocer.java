import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("Welcome to Java Grocers.");
        System.out.println("\nWhat can I help you find?");
        String userItem = scan.nextLine();

        for (int i = 0; i < aisles.length; i++) {
            if(userItem.equals(aisles[i])) {
                System.out.println("We have that in aisle: " + i);
            }
        }
    }
}
