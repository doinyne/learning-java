public class Championship {
    public static void main(String[] args) {
        int arsenal = 100;
        int spurs = 500;
        int pointsMargin = arsenal - spurs;
        
        if(pointsMargin >= 300) {
            System.out.println("Arsenal win the Championship");
        } else if (pointsMargin >= 0) {
            System.out.println("Arsenal finish second in the championship");
        } else if (pointsMargin >= -100) {
            System.out.println("Arsenal finish third in the championship");
        } else {
            System.out.println("Arsenal finish fourth");
        }
    }    
}