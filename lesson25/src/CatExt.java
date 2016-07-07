public class CatExt {

    private String name;
    private int age;
    private ColorExt color;

    public CatExt(String name, int age, ColorExt color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public ColorExt getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }
}
