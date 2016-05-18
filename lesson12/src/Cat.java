/**
 * Created by User on 28.04.2016.
 */
public class Cat extends Animal {

    Cat() {
        name = "Tom";
        age = 5;
        weight = 5;
    }

    public void voice() {
        System.out.println("Meow");
    }

    public boolean canFly() {
        return false;
    }
}
