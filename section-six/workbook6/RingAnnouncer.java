public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int win = 0;
        int losses = 0;

        for (String s : record) {
            if (s.equals("WIN")) {
                win++;
            } else {
                losses++;
            }
        }
        System.out.println("With a professional record of " + win + " wins and " + losses + " losses.");
    }
}
