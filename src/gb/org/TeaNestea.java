package gb.org;

public class TeaNestea extends Product{

    private double vol;
    private String taste;

    public TeaNestea(String name, double cost, double vol, String taste) {
        super(name, cost);
        this.vol = vol;
        this.taste =  taste;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", объем: %.1f, вкус: %s", vol, taste);
    }
}
