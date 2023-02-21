import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lets play TicTacToe");
        char[][] board = {
                {'_','_','_'},
                {'_','_','_'},
                {'_','_','_'}
        };
        printBoard(board);

        for(int i = 0; i < 9; i++) {
            if(i % 2 == 0) {
                System.out.println('X');
            } else {
                System.out.println("O");
            }
        }

    }

    public static void printBoard(char[][] board) {
        for (char[] chars : board) {
            System.out.println("\t");
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println("\n");
        }
    }
}
