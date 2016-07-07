/**
 * Created by User on 30.06.2016.
 */
public class ATM {

    User user;

    public ATM(User user) {
        this.user = user;
    }

    public void showUser() {
        user.printName();
    }
}
