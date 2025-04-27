package arithmetic;
import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        int x1, x2, x3, mult;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.print("Input x1 = ");
        x1 = input.nextInt();
        System.out.print("Input x2 = ");
        x2 = input.nextInt();
        System.out.print("Input x3 = ");
        x3 = input.nextInt();
        input.close();

        mult = x1 * x2 * x3;
        System.out.println("Mult = " + mult);
        
        result = Math.cbrt(mult);
        System.out.println("Result = " + result);
    }
}
