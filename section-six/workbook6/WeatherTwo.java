import java.util.Arrays;

public class WeatherTwo {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFahrenheit(celsius);
        System.out.println(printTemperatures(fahrenheit, Arrays.toString(fahrenheit)));
    }

    public static double[] celciusToFahrenheit(double[] celsius) {
        double[] fahren = Arrays.copyOf(celsius, celsius.length);
        for(int i = 0; i < celsius.length; i++) {
            fahren[i] = celsius[i] * 1.8 + 32;
        }
        return fahren;
    }
    //work this out on your own, don't use the workbook!
    public static double printTemperatures(double[] fahrenheit, String Fahrenheit) {
        System.out.print(Fahrenheit + ": ");
        for(int i = 0; 0 < fahrenheit.length; i++) {

        }
        return something;
    }
}
