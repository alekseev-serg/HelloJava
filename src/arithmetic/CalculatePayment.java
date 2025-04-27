/*
Напишите программу, которая вычисляет стоимость проезда в такси в зависимости от расстояния из расчета 8 руб. 50 коп. за километр. 
Ваша программа должна взаимодействовать с пользователем следующим образом: 
СЧЕТЧИК СТОИМОСТИ ПРОЕЗДА
Введите начальные показания одометра: 13505
Введите конечные показания одометра: 13810
Вы проехали 305 км. Из расчета 8 руб. 50 коп. за км,
стоимость проезда равна 2592 руб. 50 коп.
*/

package arithmetic;

import java.util.Scanner;

public class CalculatePayment {
    public static void main(String[] args) {
        int startOdometer;
        int finalOdometer;
        int totalWay;
        double totalPrice;

        final double PRICE = 8.50;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Input start way in km: ");
        startOdometer = input.nextInt();
        
        System.out.print("Input final way in km: ");
        finalOdometer = input.nextInt();
        input.close();
        totalWay = finalOdometer - startOdometer;

        System.out.println("You ride " + totalWay + " km!");
        totalPrice = totalWay * PRICE;

        System.out.println("Total price: " + totalPrice + " rubels!");
    }
}
