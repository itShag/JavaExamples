public class Circle {
    public double radius;
    public static final double PI = 3.1415;
    public int x;
    public int y;

    public double area() {
        return PI * (radius * radius);
    }

    public static double area(double radius){
        return PI * (radius * radius);
    }
}
