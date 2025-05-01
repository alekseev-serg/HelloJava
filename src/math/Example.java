package math;

public class Example {
    public static void main(String[] args) {
        char x = 'a';
        char y = 'c';
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);

        System.out.println((char)(Math.random() * 26 + 'a'));

        System.out.println('a' < 'b');
        System.out.println('a' <= 'A');
        System.out.println('a' > 'b');
        System.out.println('a' >= 'A');
        System.out.println('a' != 'b');
    }
}
