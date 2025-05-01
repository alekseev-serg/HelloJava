package conditions;

public class Conditions {
    public static void main(String[] args) {
        int ages = 25;
        int ticketPrice;

        ticketPrice = (ages >= 16) ? 20 : 10;

        System.out.println(ticketPrice);

        int x = 25;
        int scale = 3;
        if(x > 10){
            int score = 3 * scale;
        } else {
            int score = 4 * scale;
        }

        int income = 25;

        if(income > 10000){
            double tax = income * 0.2;
        }else{
            double tax = income * 0.17 + 1000;
        }
        int number = 24;
        double i = 50, j = 45;
        System.out.println((number % 3 == 0) ? i : j);
    }
}
