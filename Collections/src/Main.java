import java.util.*;

class Main {
    public static void main(String[] args) {
        // 1. Удаление дубликатов
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("Без дубликатов: " + uniqueNumbers);

        // 2. HashMap с 10 парами
        HashMap<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // 3. HashMap с 10 котами
        HashMap<String, String> cats = new HashMap<>();
        cats.put("Барсик", "Барсик");
        cats.put("Мурка", "Мурка");
        cats.put("Васька", "Васька");
        cats.put("Леопольд", "Леопольд");
        cats.put("Том", "Том");
        cats.put("Гарфилд", "Гарфилд");
        cats.put("Снежок", "Снежок");
        cats.put("Пушок", "Пушок");
        cats.put("Рыжик", "Рыжик");
        cats.put("Кузя", "Кузя");

        for (var entry : cats.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // 4. Set из 20 слов на "Л"
        Set<String> words = new HashSet<>(Arrays.asList(
                "Лес", "Лиса", "Лампа", "Лук", "Лопата", "Лестница", "Лист", "Лужа",
                "Лилия", "Лось", "Лаз", "Ласточка", "Линза", "Лень", "Ластик", "Лепесток",
                "Лед", "Лебедь", "Ловушка", "Лавка"
        ));

        System.out.println("Слова на 'Л': " + words);
    }
}
