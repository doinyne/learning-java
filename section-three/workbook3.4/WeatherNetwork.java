public class WeatherNetwork {
    public static void main(String[] args) {
        int temp = -12;
        String forecast;

        if(temp <= -1) {
            forecast = "FREEZING";
            System.out.println("The forcast is " + forecast + "! Stay home!");
        } else if(temp <= 10) {
            forecast = "Chilly";
            System.out.println("The forcast is " + forecast + ". Wear a coat!");
        } else{
            System.out.println("It's warm. Go outside");
        }
    }
}
