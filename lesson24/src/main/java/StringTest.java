public class StringTest {

    public static void main(String[] args) {
        String str = "someString (?, ?)";
        String newString = str.replace("?", "John Doe");
        System.out.println(newString);
    }
}
