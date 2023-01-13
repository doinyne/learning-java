public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int win = 0;
        int losses = 0;

        for(int i = 0; i < record.length; i++) {
            if(record[i].equals("WIN")){
                win++;
            } else {
                losses ++;
            }
        }
        System.out.println("With a professional record of " + win + " wins and " + losses + " losses.");
    }
}
