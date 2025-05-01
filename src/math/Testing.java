package math;

public class Testing {
    public static void main(String[] args) {
        System.out.println(Math.asin(0.5));
        System.out.println(Math.toRadians(30));
        System.out.println(Math.cos(Math.PI));
        System.out.println(Math.ceil(3.6));
        System.out.println(Math.rint(3.5));
        System.out.println(Math.round(3.6));
        System.out.println('3' - '2' + 'm'/'n');
        System.out.println('z' - 'a');
        System.out.println((char)4);
        
        char ch = 'B';

        System.out.println(ch >='A' && ch >= 'Z');
        System.out.println(ch >= 'A' && ch <= 'Z');
        System.out.println(ch >= 'A' || ch <= 'Z');

        String s = "java";
        System.out.println(s);
        System.out.println("java" + 1 + 2 + 3);
        System.out.println("A" + 1);
        System.out.println("AbA".compareToIgnoreCase("abC"));

        System.out.println("peter".compareToIgnoreCase("Peter"));
        System.out.println("peter".equalsIgnoreCase("peter"));
        System.out.println("peter".equalsIgnoreCase("Peter"));
        System.out.println("peter".equals("peter"));
        System.out.println("peter".compareToIgnoreCase("peter"));

        String s1 = "hello";
        String s2 = "world";

        System.out.println(s1.equals(s2) == s2.equals(s1));

        System.out.println("SELECT".substring(0, 5));

        String s3 = "Java";

        System.out.println(s3.startsWith("Java"));
        System.out.println(s3.indexOf("Java") == 0);
        System.out.println(s3.substring(0, 4).equals("Java"));
        System.out.println(s3.charAt(0) == 'j' && s3.charAt(1) == 'a' && s3.charAt(2) == 'v' && s3.charAt(3) == 'a');

    }
}
