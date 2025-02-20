import java.util.function.IntUnaryOperator;
import java.util.function.Function;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // 1. Лямбда-выражение, которое возводит в квадрат переданное число
        IntUnaryOperator square = x -> x * x;
        int result1 = square.applyAsInt(5);
        System.out.println("1. Квадрат числа 5: " + result1);

        // 2. Лямбда-выражение, которое принимает в качестве параметра массив чисел и возвращает сумму всех чисел
        Function<int[], Integer> sum = nums -> {
            int total = 0;
            for (int num : nums) {
                total += num;
            }
            return total;
        };
        int[] numbers = {1, 2, 3, 4, 5};
        int sumResult = sum.apply(numbers);
        System.out.println("2. Сумма чисел массива: " + sumResult);

        // 3. Функция деления чисел, которая принимает три параметра
        BiFunction<Integer, Integer, Integer> divide = (a, b) -> a / b;

        // 3a. С передачей третьего параметра
        int result3a = divide.apply(10, 2);
        System.out.println("3a. Результат деления 10 на 2: " + result3a);

        // 3b. Без передачи третьего параметра (деление на 1 по умолчанию)
        int result3b = divide.apply(10, 1); // Допустим, если второй параметр отсутствует
        System.out.println("3b. Результат деления 10 на 1: " + result3b);

        // 4. Лямбда-выражение, которое принимает трехзначное число и выводит его в обратном порядке
        Function<Integer, String> reverseNumber = num -> {
            String numStr = Integer.toString(num);
            StringBuilder reversed = new StringBuilder(numStr);
            return reversed.reverse().toString();
        };
        String reversedNumber = reverseNumber.apply(123);
        System.out.println("4. Число 123 в обратном порядке: " + reversedNumber);

        // 5. Лямбда-выражение, которое принимает три целых числа и возвращает количество положительных и отрицательных чисел
        Function<int[], String> countPosNeg = nums -> {
            int positiveCount = 0;
            int negativeCount = 0;
            for (int num : nums) {
                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                }
            }
            return "Положительных: " + positiveCount + ", Отрицательных: " + negativeCount;
        };
        int[] nums = {1, -2, 3, -4, 5};
        String result5 = countPosNeg.apply(nums);
        System.out.println("5. Количество положительных и отрицательных чисел: " + result5);
    }
}
