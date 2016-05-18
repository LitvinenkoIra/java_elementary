package ua.od.hillel.variables;

public class VariablesScope {

    static int classVariable = 65;

    public static void main(String[] args) {

        int num = 0;

        if (num > 0) {
            int var1 = 5;
            System.out.println("more than zero " + var1);
        }

        System.out.println(num);
        //System.out.println(var1);

        System.out.println(classVariable);
    }

    public static void method() {
        System.out.println("Class variable: " + classVariable);
    }
}
