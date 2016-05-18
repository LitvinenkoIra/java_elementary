/**
 * Created by User on 11.04.2016.
 */
public class PowerOfNumber {

    public static void main(String[] args) {

        long number = 5;
        int n = 16;

        int current = 1;
        //int result = number;
        while (current < n) {
            number = number * number;
            current = current << 1;
        }

        System.out.println(number);
        System.out.println((long)Math.pow(5, n));
    }
}

