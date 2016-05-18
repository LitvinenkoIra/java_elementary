import java.util.Random;

public class AI extends Player {

    public AI (char type){
        this("", type);
    }

    public AI (String lastname, char type){
        this(lastname, "", type);
    }

    public AI(String lastname, String firstname, char type) {
        this(lastname, firstname, "", type);
    }

    public AI(String lastname, String firstname, String middlename, char type) {
        this(lastname, firstname, middlename, 0, type);
    }


    public AI(String lastname, String firstname, String middlename, int age, char type) {
        setLastname(lastname);
        setFirstname(firstname);
        setMiddlename(middlename);
        setAge(age);
        setType(type);
    }


    @Override
    public String makeMove() {
        Random rnd = new Random();
        int x = rnd.nextInt(3);
        int y = rnd.nextInt(3);
        return String.valueOf(x) + String.valueOf(y);
    }
}
