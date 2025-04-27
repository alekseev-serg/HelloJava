package arithmetic;

public class Increment {
    public static void main(String[] args){
        int i = 10;
        int newNum = 10 * i++;
        System.out.println("i равно " + i + ", newNum равно " + newNum);

        double x = 1.0;
        double y = 5.0;
        double z = x-- + (++y);

        System.out.println("z равно " + z);

        int a = 6;
        int b = a++;
        System.out.println("1 равно " + a);
        System.out.println("2 равно " + b);
        a = 6;
        b = ++a;
        System.out.println("3 равно " + a);
        System.out.println("4 равно " + b);
    }
}
