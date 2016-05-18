public class Calculator2 {

    private int operand1;
    private int operand2;

    public Calculator2(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int add() {
        return operand1 + operand2;
    }

    public static int addStatic(int op1, int op2) {
        return op1 + op2;
    }
}
