public class Pants extends Clothes implements MenClothes, WomenClothes {
    public Pants(String size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void describeClothes() {
        System.out.println("Это штаны.");
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны для мужчины.");
    }

    @Override
    public void dressWoman() {
        System.out.println("Штаны для женщины.");
    }
}
