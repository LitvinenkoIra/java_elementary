public class Calculator {

    public int add(int operand1, int operand2) {
        return operand1 + operand2;
    }

    /* Error (перегрузка только по входным данным)
    public double add(int operand1, int operand2) {
    }
    */

    public int add(double operand1, double operand2) {
        return (int)(operand1 + operand2);
    }

    public int add(int operand) {
        return operand + operand;
    }

    public int subtract(int operand1, int operand2) {
        return operand1 - operand2;
    }

    public int multiply(int operand1, int operand2) {
        return operand1 * operand2;
    }

    public int divide(int operand1, int operand2) {
        return operand1 / operand2;
    }

    public int square(int operand) {
        return operand * operand;
    }
}
