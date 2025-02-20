public class TShirt extends Clothes implements MenClothes, WomenClothes {
    public TShirt(String size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void describeClothes() {
        System.out.println("Это футболка.");
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка для мужчины.");
    }

    @Override
    public void dressWoman() {
        System.out.println("Футболка для женщины.");
    }
}
