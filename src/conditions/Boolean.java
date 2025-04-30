package conditions;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        int num1, num2, answer;

        Scanner input = new Scanner(System.in);

        num1 = (int)(System.currentTimeMillis() % 10);
        num2 = (int)(System.currentTimeMillis() / 10 % 10);
        
        System.out.print("Сколько будет " + num1 + " + " + num2 + "? ");
        answer = input.nextInt();
        input.close();

        System.out.println(
            num1 + " + " + num2 + " = " + answer + " это " +
            (num1 + num2 == answer));
    }
}
