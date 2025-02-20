import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Перебор всех элементов HashSet
        Set<String> hashSet = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        for (String item : hashSet) {
            System.out.println(item);
        }

        // 2. Преобразование HashSet в массив
        String[] array = hashSet.toArray(new String[0]);
        System.out.println("Массив: " + Arrays.toString(array));

        // 3. Преобразование HashSet в TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet: " + treeSet);

        // 4. Представление элементов в TreeSet в обратном порядке
        System.out.println("Обратный порядок: " + treeSet.descendingSet());

        // 5. Сравнение двух HashSet
        Set<String> set1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Banana", "Cherry", "Date"));
        System.out.println("Совпадают ли наборы: " + set1.equals(set2));

        // 6. Сохранение одинаковых элементов из двух HashSet
        set1.retainAll(set2);
        System.out.println("Общие элементы: " + set1);

        // 7. Найти числа меньше 7 в TreeSet
        TreeSet<Integer> numSet = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 11));
        System.out.println("Числа меньше 7: " + numSet.headSet(7));
    }
}
