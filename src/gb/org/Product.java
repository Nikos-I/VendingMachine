package gb.org;

public class Product {
    private double cost;
    private String name;
    public Product(String name, double cost) {
        this.cost = cost;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
    @Override
    public String toString() {
        return String.format("Товар: %s, цена: %.2f", getName(), getCost());
    }

}
