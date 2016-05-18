/**
 * Created by User on 28.04.2016.
 */
public class ZooFactory {

    public Animal makeAnimal(String type) {
        Animal animal;
        switch (type) {
            case "cat":
                animal = new Cat();
                break;
            case "dog":
                animal = new Dog();
                break;
            case "parrot":
                animal = new Parrot();
                break;
            default:
                animal = null;
        }

        return animal;
    }
}
