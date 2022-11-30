import java.util.Objects;

public class Product {
    private final String name;
    private final float price;


    public Product(String name, float price) {
        if (name == null || name.isBlank() || price < 0 ) {
            throw new IllegalArgumentException("Заполните карточку продукта");
        }
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }



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
        return String.format("%s, Цена: %s", this.name, this.price);
    }


}
