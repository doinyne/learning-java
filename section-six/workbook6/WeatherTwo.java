import java.util.Arrays;

public class WeatherTwo {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFahrenheit(celsius);
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }

    public static double[] celciusToFahrenheit(double[] celsius) {
        double[] fahren = Arrays.copyOf(celsius, celsius.length);
        for(int i = 0; i < celsius.length; i++) {
            fahren[i] = celsius[i] * 1.8 + 32;
        }
        return fahren;
    }

    public static void printTemperatures(double[] temp, String tempType) {
        System.out.print(tempType + ": ");
        for(int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");

        }
        System.out.println("\n");
    }
}
