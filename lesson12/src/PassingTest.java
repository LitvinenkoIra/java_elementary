public class PassingTest {

    public static void main(String[] args) {

        int var1 = 5;
        int var2 = 3;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        System.out.println();

        swap(var1, var2);

        System.out.println();

        System.out.println("After var1 = " + var1);
        System.out.println("After var2 = " + var2);
    }

    private static void swap(int var1, int var2) {
        int temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.println("Function var1 = " + var1);
        System.out.println("Function var2 = " + var2);
    }
}
