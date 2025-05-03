public class Test {
    public static void main(String[] args) {
        // int x = 0;

        // while (x < 4) {
        //     x += 1;
        // }
        // System.out.println(x);

        // int count = 0;
        // while (count++ < 10) {
        //     System.out.println(count + ": Welocme Java");
        // }
        // int count = 0;
        // do {
        //     
        // } while(count++ < 9);
        // System.out.println(count);

        // for(int count = 1; count <= 10; count++){
        //     System.out.println(count + ": Welocme Java");
        // }

        // for(int count = 0; count < 10; count++){
        //     System.out.println(count + ": Welocme Java");
        // }

        // for(int count = 1; count < 10; count++){
        //     System.out.println(count + ": Welocme Java");
        // }

        // for(int count = 0; count <= 10; count++){
        //     System.out.println(count + ": Welocme Java");
        // }

        // for (int i = 1; i <= 10; i++){
        //     System.out.print(i + " ");
        //     i++;
        // }

        // int i = 0;
        // for (i = 1; i <= 10; i++);
        //     System.out.println(i + 4);

        // for(int i = 1; i <= 6; i++){
        //     for(int j = 6; j >= 1; j--){
        //         System.out.print(j <= i ? j + " " : " " + " ");
        //     }
        //     System.out.println();
        // }
        // int count = 1;
        // for(int i = 0; i < 10; i++)
        //     for(int j = 0; j < i; j++)
        //         System.out.println(i * j);
        //     count+=1;
        // System.out.println(count);

        // double sum = 0;
        // for (double d = 0; d < 10; sum += sum + d){
        //     d += 0.1;
        // }

        int number = 25;
        int i;

        boolean isPrime = true;
        for (i = 2; i < number && isPrime; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        System.out.println("i = " + i + " isPrime = " + isPrime);
    }
}
