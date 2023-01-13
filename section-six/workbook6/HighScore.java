import java.util.Arrays;

public class HighScore {
    public static void main(String[] args) {
        int highScore = 0;
        int[] numbersArray = new int[10];
        for(int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = randomNumber();
        }
        for(int i = 0; i < numbersArray.length; i++) {
            if(numbersArray[i] > highScore) {
                highScore = numbersArray[i];
            }
        }
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(highScore);
    }

    public static int randomNumber() {
        double num = Math.random() * 49999.0 + 1.0;
        return (int)num;
    }
}
