import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);

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
                System.out.println("Turn: X");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
            } else {
                System.out.println("Turn: O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }
            printBoard(board);
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

    public static int[] askUser(char[][]board) {
        System.out.print("Pick a row and column number: ");
        int row = scan.nextInt();
        int element = scan.nextInt();
        while (board[row][element] != '_') {
            System.out.print("Spot taken, try again: ");
            row = scan.nextInt();
            element = scan.nextInt();
        }
        return new int[] {row, element};
    }

}

