public class Atelier {

    public void dressWoman(Clothes[] clothesArray) {
        System.out.println("Одеваем женщину:");
        for (Clothes clothes : clothesArray) {
            if (clothes instanceof WomenClothes) {
                clothes.describeClothes();
                ((WomenClothes) clothes).dressWoman();
                System.out.println("Размер: " + clothes.getSize() + ", Цена: " + clothes.getPrice() + ", Цвет: " + clothes.getColor());
                System.out.println();
            }
        }
    }

    public void dressMan(Clothes[] clothesArray) {
        System.out.println("Одеваем мужчину:");
        for (Clothes clothes : clothesArray) {
            if (clothes instanceof MenClothes) {
                clothes.describeClothes();
                ((MenClothes) clothes).dressMan();
                System.out.println("Размер: " + clothes.getSize() + ", Цена: " + clothes.getPrice() + ", Цвет: " + clothes.getColor());
                System.out.println();
            }
        }
    }
}
