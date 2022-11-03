public class JavaMart {
    public static void main(String[] args) {


        
       double wallet = 100; 
       double car = 110;
       double shoes = 50;



       System.out.println("Can I get these Nike shoes?");
       if(wallet >= shoes ) {
        System.out.println("Sure!");
        wallet -= shoes;
       } else {
        System.out.println("Sorry, I only have " + wallet + " left");
       }



       System.out.println("Car I get this car?");
       if(car >= wallet) {
        System.out.println("Sorry, I only have " + wallet + " left");
       } else {
        System.out.println("Sure!");
        wallet -= car;
       }



    }    
}
