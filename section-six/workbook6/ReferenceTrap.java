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

        String[] staffLastYear2 = {"dean", "mattias", "sarndeep"};
        String[] staffThisYear2 = Arrays.copyOf(staffLastYear2, staffLastYear2.length);
        staffThisYear2[1] = "someonenew";

        System.out.println(Arrays.toString(staffLastYear2));
        System.out.println(Arrays.toString(staffThisYear2));
    }
}
