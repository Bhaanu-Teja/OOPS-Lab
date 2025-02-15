import java.io.*;
class Area_Of_Triangle {
    static double area(double h, double b)
    {
        return (h * b) / 2;
    }
    public static void main(String[] args)
    {
        double h = 10;
        double b = 5;
        System.out.println("Area of the triangle: " + area(h, b));
    }
}
