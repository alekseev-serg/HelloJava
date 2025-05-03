package loops;

public class While {
    public static void main(String[] args) {  

        int i, value;
    
        i = 0;
        value = 1;
        while (i < 7) {
          System.out.println(i + " " + value);
          i = i + 1;
          value = value * 2;
        }
    }
}
