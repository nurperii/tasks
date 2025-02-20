class GenericPrinter {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

class Math<T extends Number> {
    private T[] numbers;

    public Math(T[] numbers) {
        this.numbers = numbers;
    }

    public double sumNum() {
        double sum = 0;
        for (T num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }
}

class Elements {
    public <T> void printElems(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"Hello", "World"};

        GenericPrinter.printArray(intArray);
        GenericPrinter.printArray(strArray);

        Double[] doubleArray = {1.5, 2.5, 3.5};
        Math<Double> mathDouble = new Math<>(doubleArray);
        System.out.println("Sum: " + mathDouble.sumNum());

        Elements elements = new Elements();
        String[] arr1 = {"Cat", "Dog", "Mouse"};
        Integer[] arr2 = {1, 2, 3};

        elements.printElems(arr1);
        elements.printElems(arr2);
    }
}