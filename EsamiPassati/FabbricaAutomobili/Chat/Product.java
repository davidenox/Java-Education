package Chat;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String id;
    private String label;
    private double productionCost;
    private double sellingPrice;
    private List<Component> components;
    private double assemblyTime;

    public Product(String id, String label, double assemblyTime) {
        this.id = id;
        this.label = label;
        this.assemblyTime = assemblyTime;
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public List<Component> getComponents() {
        return components;
    }

    public double getAssemblyTime() {
        return assemblyTime;
    }

    public double getTotalOrderTime() {
        return components.stream().mapToDouble(Component::getOrderTime).max().orElse(0);
    }

    public double getComponentsCost() {
        return components.stream().mapToDouble(Component::getCost).sum();
    }

    public double calculateProductionCost(double dailyFabricationCost) {
        return getComponentsCost() + (assemblyTime * dailyFabricationCost);
    }

    public double calculateSellingPrice(double dailyFabricationCost, double profitFactor) {
        this.productionCost = calculateProductionCost(dailyFabricationCost);
        this.sellingPrice = this.productionCost * (1 + profitFactor);
        return this.sellingPrice;
    }

    public double getProfitPerTimeUnit() {
        return sellingPrice - productionCost;
    }

    public String presentation() {
        StringBuilder presentation = new StringBuilder();
        presentation.append("Product ID: ").append(id).append("\n");
        presentation.append("Label: ").append(label).append("\n");
        presentation.append("Selling Price: ").append(sellingPrice).append("\n");
        presentation.append("Components:\n");
        for (Component component : components) {
            if (!component.isPrivate()) {
                presentation.append("- ").append(component.getName())
                            .append(" (").append(component.getCountryOfOrigin()).append(")\n");
            }
        }
        return presentation.toString();
    }
}
