public class Main {
    public static void main(String[] args) {
        Recipie spisok = new Recipie("Покупки");
        Product milk = new Product("Молоко", 85);
        Product grecha = new Product("Гречка", 99);
        Product strawberries = new Product("Земляника", 985);
        Product blueberries = new Product("Голубика", 1000);
        Product cottageCheese = new Product("Творог", 112);
        Product honey = new Product("Мед", 650);
        spisok.addProduct(milk, 3);
        spisok.addProduct(strawberries, 1);
        spisok.addProduct(blueberries, 1);
        spisok.addProduct(cottageCheese, 2);
        spisok.addProduct(honey, 1);
        spisok.addProduct(grecha, 5);
        System.out.println(spisok);
        System.out.println("Стоимость покупок: " + spisok.getRecipiePrice());
    }
}