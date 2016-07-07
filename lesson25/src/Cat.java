public class Cat {

    private String name;
    private int age;
    private Color color;

    public Cat(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }
}
