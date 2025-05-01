package conditions;

public class Conditions {
    public static void main(String[] args) {
        int ages = 25;
        int ticketPrice;

        ticketPrice = (ages >= 16) ? 20 : 10;

        System.out.println(ticketPrice);

        int x = 25;
        int scale = 3;
        int score;
        if(x > 10){
            score = 3 * scale;
        } else {
            score = 4 * scale;
        }
        System.out.println(score);

        int income = 25;
        double tax;
        if(income > 10000){
            tax = income * 0.2;
        }else{
            tax = income * 0.17 + 1000;
        }
        System.out.println(tax);


        int number = 24;
        double i = 50, j = 45;
        System.out.println((number % 3 == 0) ? i : j);
    }
}
