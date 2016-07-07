import java.sql.Statement;

public class Stack {

    private int[] array;
    private int pointer;

    private final static int MAX_SIZE = 5;

    public Stack() {
        array = new int[MAX_SIZE];
    }

    public void push(int value) throws MaxElementsReachedException {
        if (pointer > MAX_SIZE) {
            throw new MaxElementsReachedException("Max element has been reached");
        }
    }

    public int pop() throws NoMoreElementsException {
        if (pointer < 0) {
            throw new NoMoreElementsException("No more elements");
        }
        return 0;
    }
}
