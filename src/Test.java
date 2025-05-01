public class Test {
    public static void main(String[] args) {
        int x = 15;
        int y = -1;
        int z = 1;

        if (x > 0){
            if(y > 0){
                System.out.println("'x > 0 and y > 0'");
            }
        } else if (z > 0){
            System.out.println("'x < 0 and z > 0'");
        }

        if((x < 100) && (x > 10))
            System.out.println("x between 10 and 100");
            
        int number = 10;
        boolean even;
        even = number % 2 == 0;
        System.out.println(even);

        int q = 1;
        int j = q = q + 1;
        System.out.println(j);

        boolean ev = false;
        if (ev = true){
            System.out.println(ev);
        }
    }
}
