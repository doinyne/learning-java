public class Tip {
    public static void main(String[] args) {
        System.out.println("$" + totalTip(53.50)); ;
    }
    
    public static double totalTip(double bill) {
        double tip = bill * 0.15;
        return tip;
    }
}

