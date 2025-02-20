public class Tie extends Clothes implements MenClothes {
    public Tie(String size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void describeClothes() {
        System.out.println("Это галстук.");
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук для мужчины.");
    }
}
