import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;
    double salary;

    // Конструктор
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", salary=" + salary + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем список объектов Person
        List<Person> people = Arrays.asList(
                new Person("Kairat", 30, 50000),
                new Person("Dastan", 25, 60000),
                new Person("Arlen", 35, 70000)
        );

        // 1. Сумма возраста и суммы заработной платы всех объектов Person
        int totalAge = people.stream().mapToInt(Person::getAge).sum();
        double totalSalary = people.stream().mapToDouble(Person::getSalary).sum();

        System.out.println("Сумма возрастов: " + totalAge);
        System.out.println("Сумма зарплат: " + totalSalary);

        // 2. Средний возраст и средняя заработная плата
        double averageAge = people.stream().mapToInt(Person::getAge).average().orElse(0);
        double averageSalary = people.stream().mapToDouble(Person::getSalary).average().orElse(0);

        System.out.println("Средний возраст: " + averageAge);
        System.out.println("Средняя зарплата: " + averageSalary);
    }
}
