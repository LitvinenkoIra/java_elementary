package calculator;

public class Multiplier extends BaseCalculator {

    Multiplier(int op1, int op2) {
        this.operand1 = op1;
        this.operand2 = op2;
    }

    int calculate() {
        int result = operand1 * operand2;
        return result;
    }

    public String printOperation() {
        return "Multiplication";
    }
}
