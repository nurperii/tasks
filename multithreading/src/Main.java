// 1.1. Создание класса NewThread, который расширяет Thread
class NewThread extends Thread {
    // 1.2. Переопределение метода run
    @Override
    public void run() {
        // Цикл, который выводит символ 100 раз
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 1.3. Создание экземпляра класса NewThread
        NewThread thread = new NewThread();

        // Запуск нового потока
        thread.start();
    }
}
