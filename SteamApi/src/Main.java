import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "my", "dear", "friend");
        System.out.println(words.stream().reduce("", (a, b) -> a + " " + b).trim());
    }
}