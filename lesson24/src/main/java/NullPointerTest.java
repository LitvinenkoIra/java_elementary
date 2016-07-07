/**
 * Created by User on 30.06.2016.
 */
public class NullPointerTest {

    public static void main(String[] args) {

        User user = new User();
        ATM atm = new ATM(user);

        atm.showUser();
    }
}
