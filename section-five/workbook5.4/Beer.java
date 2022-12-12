import java.util.Scanner;

public class Beer {
    public static void main(String[] args) {
        sing(99);
    }

    public static void sing(int i) {
        for(int k = i; k > 0; k--) {
            System.out.println(k + " bottles of beer on the wall, " + k + " bottles of beer!");
            System.out.println("take one down, pass it around " + (k - 1) + ", bottles of beer on the wall!");
        }
    }
}