package ua.od.hillel.first;

public class SwitchExample {

    public static void main(String[] args) {

        String cond = "1";

        switch (cond) {
            case "1":
                System.out.println("1");
                //break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            default:
                System.out.println("something else");
        }
    }
}
