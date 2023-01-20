package gb.org;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProductList().add(new Product("Яблоко", 10));
        vendingMachine.getProductList().add(new Product("Груша", 20));
        vendingMachine.getProductList().add(new Product("Яблоко1", 10));
        vendingMachine.getProductList().add(new Chocolate("Шоколад молочный", 120, 0.2));
        vendingMachine.getProductList().add(new Product("Яблоко1", 10));
        vendingMachine.getProductList().add(new TeaNestea("Чай Нести", 30, 0.5, "Малина"));
        for(Product product : vendingMachine.getProductList()) {
            System.out.println(product.toString());
        }
    }
}
