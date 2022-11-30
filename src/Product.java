import java.util.Objects;

public class Product {
    private final String name;
    private final float price;
    private final int quantity;
    private boolean checked;

    public Product(String name, float price, int quantity) {
        if (name == null || name.isBlank() || price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Заполните карточку продукта");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.checked = false;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setChecked() {
        this.checked = true;
    }
    public boolean isCheked(){return checked;}

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isCheked() ? "Да" : "Нет";
        return String.format("%s, Цена: %s, Количество: %s, Куплен: %s", this.name, this.price, this.quantity, checkedString);
    }

    public static class ProductAlreadyExistException extends Exception {
        public ProductAlreadyExistException(String message) {

            System.out.printf("Продукт %s уже добавлен в список \n", message);


        }
    }
}
