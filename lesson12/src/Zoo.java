import java.util.Scanner;

/**
 * Created by User on 28.04.2016.
 */
public class Zoo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        ZooFactory zooFactory = new ZooFactory();
        Animal animal = zooFactory.makeAnimal(input);

        animal.voice();
        System.out.println(animal.canFly());
    }
}
