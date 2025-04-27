/*
 Напишите программу, которая конвертирует сумму денег из американских долларов в российские рубли по курсу покупки 72.12.
 */

package project;

import java.util.Scanner;

public class Convertation {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12;
        int dollars;
        double roubles;

        Scanner input = new Scanner(System.in);

        System.out.print("Input sum of dollars: ");
        dollars = input.nextInt();
        roubles = ROUBLES_PER_DOLLAR * dollars;

        System.out.println("You recive total " + (int)roubles + " roubles!");
        input.close();
    }
}
