package task4;

import java.util.function.Consumer;

class HeavyBox {
    int weight;

    HeavyBox(int weight) {
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Consumer<HeavyBox> shipBox = box -> System.out.println("Отгрузили ящик с весом " + box.weight);
        Consumer<HeavyBox> sendBox = box -> System.out.println("Отправляем ящик с весом " + box.weight);

        Consumer<HeavyBox> processBox = shipBox.andThen(sendBox);

        HeavyBox box = new HeavyBox(10);
        processBox.accept(box);
    }
}
