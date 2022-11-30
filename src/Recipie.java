import java.util.Objects;
import java.util.Set;

public class Recipie {
    private final String name;
    private final Set<Product> products;

    public Recipie(String name, Set<Product> products) {
        if (name == null || name.isBlank() || products == null || products.size() == 0) {
            throw new IllegalArgumentException("НЕ все поля рецепта заполнены");
        }
        this.name=name;
        this.products=products;
    }

    public String getName() {
        return name;
    }

    public float getRecipiePrice() {
        float sum = 0;
        for (Product product : products) {
            sum+=product.getPrice();
        }
        return sum;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recipie recipie=(Recipie) o;
        return Objects.equals(name, recipie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов в рецепте: ").append('\n');
        for (Product product : this.products) {
            stringBuilder.append(product.getName()).append('\n');
        }
        return stringBuilder.toString();
    }
}
