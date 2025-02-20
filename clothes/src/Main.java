public class Main {
    public static void main(String[] args) {
        Clothes[] clothesArray = new Clothes[]{
                new TShirt("M", 20.0, "Красный"),
                new Pants("L", 30.0, "Черные"),
                new Skirt("S", 40.0, "Синий"),
                new Tie("M", 15.0, "Черный")
        };

        Atelier atelier = new Atelier();
        atelier.dressWoman(clothesArray); // Одеваем женщину
        atelier.dressMan(clothesArray);   // Одеваем мужчину
    }
}
