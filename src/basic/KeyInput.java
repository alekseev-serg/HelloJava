package basic;
import java.util.Scanner;

public class KeyInput {
    public static void main(String[] args) {
        double radius;
        double area;
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        // Take radius value from User
        System.out.print("Input radius of area: ");
        radius = input.nextDouble();
        input.close();
        // Calculate the area of the circle
        area = PI * radius * radius;
        System.out.println("Area for radius " + radius + " equal " + area + "!");
    }
}
