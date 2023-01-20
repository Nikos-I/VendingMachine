package gb.org;

public class Chocolate extends Product{
    private double weight;

    public Chocolate(String name,double cost,double weight) {
        super(name, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", вес: %.3f", weight);
    }
}
