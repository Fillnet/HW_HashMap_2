import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipie {
    private final String name;
    private final Map<Product, Integer> products = new HashMap<>();

    public Recipie(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("НЕ все поля рецепта заполнены");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product, int quanty) {
        if (quanty <= 0) {
            quanty = 1;
        }
        if (this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + quanty);
        } else {
            this.products.put(product, quanty);
        }
    }

    public float getRecipiePrice() {
        float sum = 0;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recipie recipie = (Recipie) o;
        return Objects.equals(name, recipie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список купленных продуктов: ").append('\n');
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            stringBuilder.append(product.getKey()).append(" количество:" + product.getValue() + '\n');
        }
        return stringBuilder.toString();
    }
}
