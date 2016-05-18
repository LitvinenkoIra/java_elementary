package calculator;

public class ClassRange {

    static Person p1 = new Person(5);
    static Person p2 = new Person(10);

    public static void main(String[] args) {

        System.out.println("p1 age: " + p1.age);
        System.out.println("p2 age: " + p2.age);

        System.out.println();

        swap();

        System.out.println("After p1 age: " + p1.age);
        System.out.println("After p2 age: " + p2.age);
    }

    public static void swap() {
        int temp = p1.age;
        p1.age = p2.age;
        p2.age = temp;
    }
}
