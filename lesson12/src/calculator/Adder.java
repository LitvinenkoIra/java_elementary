package calculator;

public class Adder extends BaseCalculator {

    Adder(int op1, int op2) {
        this.operand1 = op1;
        this.operand2 = op2;
    }

    int calculate() {
        int result = operand1 + operand2;
        return result;
    }

    public String printOperation() {
        return String.valueOf(operand1) + " + " + String.valueOf(operand2) + " =";
    }
}
