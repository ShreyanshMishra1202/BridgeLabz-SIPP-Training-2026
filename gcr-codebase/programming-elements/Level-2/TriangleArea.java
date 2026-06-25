import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter height (in cm): ");
        double height = input.nextDouble();

        // Area in cm²
        double areaCm = 0.5 * base * height;

        // Convert to in² (1 inch = 2.54 cm → 1 cm² = (1/2.54)² in²)
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);
    }
}
