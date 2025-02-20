package task3;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> startsWithJorN = str -> str.startsWith("J") || str.startsWith("N");
        Predicate<String> endsWithA = str -> str.endsWith("A");

        Predicate<String> checkString = startsWithJorN.and(endsWithA);

        System.out.println(checkString.test("Java")); // false
        System.out.println(checkString.test("JAVAA")); // true
        System.out.println(checkString.test("NOVA")); // true
        System.out.println(checkString.test("Python")); // false
    }
}
