public class Skirt extends Clothes implements WomenClothes {
    public Skirt(String size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void describeClothes() {
        System.out.println("Это юбка.");
    }

    @Override
    public void dressWoman() {
        System.out.println("Юбка для женщины.");
    }
}
