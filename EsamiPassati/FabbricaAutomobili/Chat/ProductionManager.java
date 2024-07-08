package Chat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductionManager {
    private List<Product> products;
    private double dailyFabricationCost;
    private double profitFactor;

    public ProductionManager(double dailyFabricationCost, double profitFactor) {
        this.products = new ArrayList<>();
        this.dailyFabricationCost = dailyFabricationCost;
        this.profitFactor = profitFactor;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateDailyFabricationCost(double dailyFabricationCost) {
        this.dailyFabricationCost = dailyFabricationCost;
    }

    public void updateProfitFactor(double profitFactor) {
        this.profitFactor = profitFactor;
    }

    public void calculatePrices() {
        for (Product product : products) {
            product.calculateSellingPrice(dailyFabricationCost, profitFactor);
        }
    }

    public List<Product> getProfitTimeRankedProducts() {
        products.sort(Comparator.comparingDouble(Product::getProfitPerTimeUnit).reversed());
        return products;
    }

    public void showProductPresentations() {
        for (Product product : products) {
            System.out.println(product.presentation());
        }
    }
}
