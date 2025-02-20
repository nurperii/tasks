import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // 1. Связать указанное значение с указанным ключом в HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");  // Связать "key1" с "value1"
        System.out.println("1. HashMap: " + hashMap);

        // 2. Проверить, содержит ли map отображение для указанного ключа
        if (hashMap.containsKey("key1")) {
            System.out.println("2. Ключ 'key1' найден в HashMap.");
        } else {
            System.out.println("2. Ключ 'key1' не найден в HashMap.");
        }

        // 3. Проверить, содержит ли карта сопоставление значений ключа (пустые) или нет
        if (hashMap.containsValue("")) {
            System.out.println("3. HashMap содержит пустое значение.");
        } else {
            System.out.println("3. HashMap не содержит пустое значение.");
        }

        // 4. Получить представление коллекции значений, содержащихся в Map
        Collection<String> values = hashMap.values();
        System.out.println("4. Значения в HashMap: " + values);

        // 5. Связать указанное значение с указанным ключом в TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("key1", "value1");  // Связать "key1" с "value1"
        System.out.println("5. TreeMap: " + treeMap);

        // 6. Получить все ключи из TreeMap
        Set<String> keys = treeMap.keySet();
        System.out.println("6. Ключи в TreeMap: " + keys);

        // 7. Получить отображение "ключ-значение", связанное с наибольшим ключом и наименьшим ключом в Map
        System.out.println("7. Наименьший ключ в TreeMap: " + treeMap.firstEntry());
        System.out.println("7. Наибольший ключ в TreeMap: " + treeMap.lastEntry());

        // 8. Получить представление NavigableSet для ключей, содержащихся в Map
        System.out.println("8. NavigableSet для ключей в TreeMap: " + treeMap.navigableKeySet());

        // 9. Получить отображение "ключ-значение", связанное с наибольшим и наименьшим ключом в Map
        System.out.println("9. Наименьший ключ и значение: " + treeMap.firstEntry());
        System.out.println("9. Наибольший ключ и значение: " + treeMap.lastEntry());

        // 10. Получить представление коллекции значений в Map
        Collection<String> treeMapValues = treeMap.values();
        System.out.println("10. Значения в TreeMap: " + treeMapValues);
    }
}
