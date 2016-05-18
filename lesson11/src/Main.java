public class Main {

    public static void main(String[] args) {

        int a = 3, b = 5;
        String operation = "multiply";
        int result = 0;

        switch (operation) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                result = a / b;
                break;
        }

        System.out.println("The result is " + result);
    }

}
