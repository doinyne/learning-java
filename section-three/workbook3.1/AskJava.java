public class AskJava {
    public static void main(String[] args) {
        double change = 3.50;
        double price = 2.50;

        System.out.println("Me: Hi Java, do I have enough to buy chips?");
        System.out.println("Java: " + (change >= price) + "\n");

        int elevator = 15;
        int people = 10;

        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        System.out.println("Java: " + (people <= elevator) + "\n");

        String friendHappy = "happy";
        String friendSad = "sad";

        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + friendHappy.equals(friendSad) + "\n");

    }   
}
