public class CalculatorTest {

    public static void main(String[] args) {
        //Calculator calculator = new Calculator();
        //int result = calculator.add(5, 3);
        //int result = calculator.add(5.0, 3.0);
        //int result2 = calculator.square(7);

//        System.out.println(result);
        //System.out.println(resultFromStatic);

        Calculator2 first = new Calculator2(5, 3);
        System.out.println(first.add());

        Calculator2 second = new Calculator2(7, 4);
        System.out.println(second.add());

        int resFromStatic = Calculator2.addStatic(7, 8);
        System.out.println(resFromStatic);
    }
}
