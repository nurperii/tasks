package task2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isNotNull = str -> str != null;

        System.out.println(isNotNull.test("Hello")); // true
        System.out.println(isNotNull.test(null));    // false   2.2) System.out.println(isNotNull.test(" ")); проверка, что строка не пуста
    }
}
