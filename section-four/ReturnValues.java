public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.6);
        printArea(2.3, 3.6, area1);

        calculateArea(-5, 2.6);

        String englishExplanation = explainArea("English");

    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("INVAID DIMENTIONS");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la larguer";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "Language not available";
        }
    }

    public static void printArea(double length, double width, double area) {
        System.out.println("A rectanlge has a length of " + length + " a width of " + width + " and an area of " + area);
    }
}
