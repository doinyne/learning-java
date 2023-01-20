public class RandomNumbers {
    public static void main(String[] args) {
        int[][] twoDArray = new int[100][10];
        for(int i = 0; i < twoDArray.length; i++) {
            for(int j = 0; j < twoDArray[i].length; j++){
                twoDArray[i][j] = randomNumber();
            }
        }
        print2DArray(twoDArray);
    }

    public static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }

    public static void print2DArray(int[][] numbersArray) {
        for (int[] ints : numbersArray) {
            for (int j = 0; j < numbersArray[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println("\n");
        }
    }
}
