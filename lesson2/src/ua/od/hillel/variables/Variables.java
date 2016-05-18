package ua.od.hillel.variables;

public class Variables {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;

        /*
        if (a == 10 & b == 20) {
            System.out.println("true");
        } else {
            System.out.println("something is wrong");
        }

        boolean result = (a != 10);

        if (result) {
            System.out.println("not equals 10");
        }
        */

        boolean bool = (a == 20);
        if (!bool) {
            System.out.println("result is true");
        } else {
            System.out.println("result is false");
        }
    }
}
