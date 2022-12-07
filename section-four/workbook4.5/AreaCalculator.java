public class AreaCalculator {

  static double side = 2;
  static double lenght = 1;
  static double width = 2;
  static double base = 1;
  static double height = 2;
  static double radius = 2;
  public static void main(String[] args) {
    printAreas();
  }

  public static void areaSquare(double side) {
    if(side < 0) {
      System.out.println("Impossible");
    } else {
      double areaOfSquare = side * 2;
      System.out.println("the area of your square is: " + areaOfSquare);
    }
  }

  public static void areaRectangle(double length, double width) {
    if(length < 0 || width < 0) {
      System.out.println("Error: Impossible");
    } else {
      double areaOfRectangle = length * width;
      System.out.println("the area of your rectangle is: " + areaOfRectangle);
    }
  }

  public static void areaTriangle(double base, double height) {
    if(base < 0 || height < 0) {
      System.out.println("Error: Impossible");
    }else {
      double areaOfTriangle = base * height / 2;
      System.out.println("the area of your triangle is: " + areaOfTriangle);
    }
  }
  
  public static void areaCircle(double radius) {
    if(radius < 0) {
      System.out.println("Error: Impossible");
    } else {
      double areaOfCircle = Math.PI * radius * 2;
      System.out.println("the area of your circle is: " + areaOfCircle);
    }
  }

  public static void printAreas() {
    areaSquare(side);
    areaRectangle(lenght, width);
    areaTriangle(base, height);
    areaCircle(radius);
  }
}


