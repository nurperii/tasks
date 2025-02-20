public class Main {
    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Привет, это лямбда!");
        printable.print();
    }
}