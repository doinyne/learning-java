public class MathOperations {
    public static void main(String[] args) {
        int bagOfSweets1 =5;
        int bagOfSweets2 = 10;

        long starsInTheMilkyWay = 2500000000L;
        long starsInAndromeda = 1000000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;

        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + (starsInTheMilkyWay + starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScore + bonusMarks) + "/10 on his potions test. Snape wasn't too thrilled");

        System.out.println("Fred has  " + (bagOfSweets2 - bagOfSweets1) + "  more sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInTheMilkyWay) + " more stars than the Milky Way");
        System.out.println("Snape ended up removing marks. Ron actually scored " + (testScore - bonusMarks) + " on his potions test");

        System.out.println("Fred and George used a special spell to multiply their sweets to: " + (bagOfSweets1 * bagOfSweets2) + "");
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore * bonusMarks) + "/10");

        System.out.println("Originally, Fred had  " + (bagOfSweets2 / bagOfSweets1) + " times more sweets than George");
        System.out.println("Andromeda has " + (starsInAndromeda / starsInTheMilkyWay) + " times more stars");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore / bonusMarks));
    }
}

// Fred and George collected <result> sweets
// There are <result> stars in the Milky Way and Andromeda galaxies.
// With bonus marks, Ron scored <result>/10 on his potions test. Snape wasn't too thrilled

// Fred has  <result>  more sweets than George
// The Andromeda Galaxy has <result> more stars than the Milky Way
// Snape ended up removing marks. Ron actually scored <result> on his potions test

// Fred and George used a special spell to multiply their sweets to: <result>
// Snape made an error on his excel, accidentally multiplying Ron's score to: <result>/10

// Originally, Fred had  <result> times more sweets than George
// Andromeda has <result> times more stars
// Snape caught the error. Furious, he divided Ron's score to: <result>