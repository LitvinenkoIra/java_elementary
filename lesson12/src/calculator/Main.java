package calculator;

public class Main {

    public static void main(String[] args) {
        BaseCalculator[] calculators =
                {  new Adder(2, 3),
                        new Subtracter(5, 2),
                        new Multiplier(2, 6),
                        new Divider(10, 5)  };

        for (int i = 0; i < calculators.length; i++) {
            int result = calculators[i].calculate();
            System.out.println(calculators[i].printOperation() + " " + result);
        }
    }

}
