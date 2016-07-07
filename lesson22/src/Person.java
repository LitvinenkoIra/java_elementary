public class Person implements Comparable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        //return Integer.compare(this.age, person.age);
        if (this.age < person.age)
            return -1;

        if (this.age > person.age)
            return 1;

        return 0;
    }

    public String toString() {
        String result = this.name + " " + this.age;
        return result;
    }
}
