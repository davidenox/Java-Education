package Chat;

public class Main {
    public static void main(String[] args) {
        ProductionManager manager = new ProductionManager(100, 0.2);

        Product carDoor = new Product("001", "Car Door", 2);
        carDoor.addComponent(new Component("Metal Frame", "Germany", 3, 200, false));
        carDoor.addComponent(new Component("Glass Window", "Italy", 2, 150, false));
        carDoor.addComponent(new Component("Plastic Handle", "China", 1, 50, true));

        Product engine = new Product("002", "Engine", 5);
        engine.addComponent(new Component("Pistons", "Japan", 7, 300, false));
        engine.addComponent(new Component("Cylinders", "USA", 5, 400, false));
        engine.addComponent(new Component("Spark Plugs", "France", 3, 100, true));

        manager.addProduct(carDoor);
        manager.addProduct(engine);

        manager.calculatePrices();
        manager.showProductPresentations();

        System.out.println("Ranked Products by Profit/Time:");
        for (Product product : manager.getProfitTimeRankedProducts()) {
            System.out.println(product.getLabel() + ": " + product.getProfitPerTimeUnit());
        }
    }
}