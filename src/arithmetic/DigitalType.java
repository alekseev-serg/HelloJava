package arithmetic;

public class DigitalType {
    public static void main(String[] args) {
        System.out.println((int)1.7);
        System.out.println((double)1/2);
        System.out.println(1/2);

        double d = 4.5;
        int y = (int)d;
        System.out.println(d);
        System.out.println(y);

        int sum = 0;
        sum += 4.5;
        System.out.println(sum);

        float f = 12.5F;
        int i = (int)f;
        System.out.println("f равно " + f);
        System.out.println("i равно " + i);

        double amount = 5;
        System.out.println(amount / 2);
        System.out.println(5 / 2);
    }
}
