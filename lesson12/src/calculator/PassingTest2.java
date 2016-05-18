package calculator;

public class PassingTest2 {

    public static void main(String[] args) {

        Person p1 = new Person(5);
        Person p2 = new Person(10);

        System.out.println("p1 age: " + p1.age);
        System.out.println("p2 age: " + p2.age);

        System.out.println();

        swap(p1, p2);

        System.out.println("After p1 age: " + p1.age);
        System.out.println("After p2 age: " + p2.age);
    }

    public static void swap(Person p1, Person p2) {
        int temp = p1.age;
        p1.age = p2.age;
        p2.age = temp;
    }
}
