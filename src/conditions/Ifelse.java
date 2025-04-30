package conditions;

public class Ifelse {
    public static void main(String[] args) {
        int score = 70;
        double pay = 50;

        if (score > 90) {
            pay *= 1.03;
        } else {
            pay *= 1.01;
        }

        System.out.println("pay = " + pay);
    }
}
