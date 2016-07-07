public class MainForCustomLinkedList {

    public static void main(String[] args) {

        CustomLinkedList<Cat> list = new CustomLinkedList<>();
        //list.add("a");
        //list.add("b");
        list.add(new Cat("Tom"));
        //list.add(new Object());

        Cat o = list.poll();
    }
}
