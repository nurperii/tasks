public abstract class Clothes {
    private String size;
    private double price;
    private String color;

    public Clothes(String size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public abstract void describeClothes();

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
