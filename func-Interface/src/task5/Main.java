package task5;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> checkNumber = num -> {
            if (num > 0) return "Положительное число";
            else if (num < 0) return "Отрицательное число";
            else return "Ноль";
        };

        System.out.println(checkNumber.apply(5));   // Положительное число
        System.out.println(checkNumber.apply(-3));  // Отрицательное число
        System.out.println(checkNumber.apply(0));   // Ноль
    }
}
