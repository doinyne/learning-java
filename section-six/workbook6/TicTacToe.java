import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Lets play TicTacToe");
        char[][] board = {
                {'_','_','_'},
                {'_','_','_'},
                {'_','_','_'}
        };
        printBoard(board);
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
