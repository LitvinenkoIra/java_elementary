import java.util.Scanner;

public class Human extends Player {

    public Human (char type){
        this("", type);
    }

    public Human (String lastname, char type){
        this(lastname, "", type);
    }

    public Human(String lastname, String firstname, char type) {
        this(lastname, firstname, "", type);
    }

    public Human(String lastname, String firstname, String middlename, char type) {
        this(lastname, firstname, middlename, 0, type);
    }


    public Human(String lastname, String firstname, String middlename, int age, char type) {
        setLastname(lastname);
        setFirstname(firstname);
        setMiddlename(middlename);
        setAge(age);
        setType(type);
    }

    @Override
    public String makeMove() {
        Scanner scanner = new Scanner(System.in);
        String move = scanner.next();
        return move;
    }
}
