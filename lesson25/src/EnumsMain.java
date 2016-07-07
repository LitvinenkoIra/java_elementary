public class EnumsMain {

    public static void main(String[] args) {

        //String[] str = {"WHITE", "BLACK", "RED"};
        //str[1];

        int fruitType = Fruit.APPLE_RED;
        int wrongFruitType = 5;

        Apple redApple = Apple.RED;
        Orange whiteOrange = Orange.WHITE;

        Cat barsik = new Cat("Barsik", 5, Color.WHITE);
        Cat murzik = new Cat("Murzik", 7, Color.BLACK);

        switch (barsik.getColor()) {
            case BLACK:
                System.out.println(barsik.getName() + " " + barsik.getColor());
                break;
            case WHITE:
                System.out.println(barsik.getName() + " " + barsik.getColor());
                break;
            default:
                System.out.println("No color is set");
        }

        for (Color color : Color.values()) {
            System.out.println(color + " " + color.ordinal());
        }

        CatExt cat = new CatExt("Fat Cat", 8, ColorExt.RED);
        String catColor = cat.getColor().getColorValue();
        System.out.println(catColor);

        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.someAction();
    }
}
