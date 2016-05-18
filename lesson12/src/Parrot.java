/**
 * Created by User on 28.04.2016.
 */
public class Parrot extends Animal {

    Parrot() {
        name = "Blue Parrot";
        age = 6;
        weight = 1;
    }

    public void voice() {
        System.out.println("Parrot");
    }

    public boolean canFly() {
        return true;
    }
}
