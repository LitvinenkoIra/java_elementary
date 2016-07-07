import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person sam = new Person("Sam", 25);
        Person mark = new Person("Mark", 35);
        Person bob = new Person("Bob", 15);

        List<Person> persons = new ArrayList<>();
        persons.add(sam);
        persons.add(mark);
        persons.add(bob);

        Collections.sort(persons);

        System.out.println("Compare by age: " + persons);

        Collections.sort(persons, new PersonNameComparator());

        System.out.println("Compare by name: " + persons);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getName().compareTo(person2.getName());
            }
        });

        System.out.println("Compare by name: " + persons);
    }
}
