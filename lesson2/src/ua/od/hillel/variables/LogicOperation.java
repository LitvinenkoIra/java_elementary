package ua.od.hillel.variables;

public class LogicOperation {

    public static void main(String[] args) {
        //method1();
        //method2();

        if (method1() || method2()) {
            System.out.println("Result is true");
        }
    }

    public static boolean method1() {
        System.out.println("In method1");
        return true;
    }

    public static boolean method2() {
        System.out.println("In method2");
        return true;
    }
}