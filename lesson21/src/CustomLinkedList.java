public class CustomLinkedList<E> {

    private Node first;
    private Node last;

    private class Node {
        E value;
        Node next;
    }

    public void add(E value) {
        Node node = new Node();
        node.value = value;
        node.next = null;

        if (last != null) {
            last.next = node;
        }

        last = node;

        if (first == null) {
            first = node;
        }
    }

    public E poll() {
          return first.value;
    }
}
