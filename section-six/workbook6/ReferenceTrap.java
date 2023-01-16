import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"dean", "mattias", "sarndeep"};
        String[] staffThisYear = new String[staffLastYear.length];

        for(int i = 0; i < staffLastYear.length; i++) {
            staffThisYear[i] = staffLastYear[i];
        }
        staffThisYear[2] = "someoneelse";
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
