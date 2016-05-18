/**
 * Created by User on 28.04.2016.
 */
public class Dog extends Animal {

    Dog() {
        name = "Pluto";
        age = 3;
        weight = 10;
    }

    public void voice() {
        System.out.println("Bark");
    }

    public boolean canFly() {
        return false;
    }
}
