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

        int digit; 
        
        if (dollars >= 5 && dollars <=20){
            System.out.println(" Американских долларов равны ");
        } else {
            digit = dollars % 10;
        
            if(digit == 1){
                System.out.println(" Американский доллар равен ");
            } else if (digit <=2 && digit <= 4){
                System.out.println(" Американских долларов равны ");
            } else {
                System.out.println(" Американских долларов равны ");
            }
        }
            
        roubles = ROUBLES_PER_DOLLAR * dollars;

        System.out.println((int)roubles + " roubles!");
        input.close();
    }
}
