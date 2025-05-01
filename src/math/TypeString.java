package math;

import java.util.Scanner;

public class TypeString {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        System.out.println("Длина строки " + message + " равна " + message.length());

        message += " and Java is fun";
        System.out.println("Длина строки " + message + " равна " + message.length());

        String s;
        char ch;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Введите символ: ");
        s = input.nextLine();
        input.close();
        ch = s.charAt(0);
        
        System.out.println("Введенный символ равен " + ch);

        if (message.equals(s)){
            System.out.println("string1 и string2 имеют " + "одинаковое содержимое");
        }else{
            System.out.println("string1 и string2 не равны");
        }

        System.out.println(message.compareTo(s)); 

        // "Welcome to Java".startsWith("We") возвращает true.
        // "Welcome to Java".startsWith("we") возвращает false.
        // "Welcome to Java".endsWith("va") возвращает true.
        // "Welcome to Java".endsWith("v") возвращает false.
        // "Welcome to Java".contains("to") возвращает true.
        // "Welcome to Java".contains("To") возвращает false.

        System.out.println(message.substring(0,11) + "HTML");

        String intString = "23";
        int intValue = Integer.parseInt(intString);
        System.out.println(intValue);

        System.out.println("1" + 1);
        System.out.println('1' + 1);
        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        System.out.println('1' + 1 + 1);

        System.out.println(1 + "Welcome " + 1 + 1);
        System.out.println(1 + "Welcome " + (1 + 1));
        System.out.println(1 + "Welcome " + ('\u0001' + 1));
        System.out.println(1 + "Welcome " + 'a' + 1);
    }
}
