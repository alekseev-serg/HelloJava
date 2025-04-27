package arithmetic;
import java.util.Scanner;

public class DIsplayTime {
    public static void main(String[] args) {
        int seconds, minutes, remainingSeconds;

        Scanner input = new Scanner(System.in);
        System.out.print("Input value of seconds: ");

        // Get time in seconds
        seconds = input.nextInt();

        // Get time in minutes
        minutes = seconds / 60;

        // Calculate remaining second in minute
        remainingSeconds = seconds % 60;
        input.close();

        System.out.println(seconds + " contains " + minutes + "min." + remainingSeconds + "sec");

        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);

        System.out.println("25 / 4 равно " + 25 / 4);
        System.out.println("25 / 4.0 равно " + 25 / 4.0);
        System.out.println("3 * 2 / 4 равно " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 равно " + 3.0 * 2 / 4);
    }
}
