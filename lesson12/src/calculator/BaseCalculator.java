package calculator;

public abstract class BaseCalculator {

    int operand1;
    int operand2;

    abstract int calculate();
    abstract String printOperation();
}
