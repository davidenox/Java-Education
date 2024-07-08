package Chat;

public class Component {
    private String name;
    private String countryOfOrigin;
    private double orderTime;
    private double cost;
    private boolean isPrivate;

    public Component(String name, String countryOfOrigin, double orderTime, double cost, boolean isPrivate) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.orderTime = orderTime;
        this.cost = cost;
        this.isPrivate = isPrivate;
    }

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public double getOrderTime() {
        return orderTime;
    }

    public double getCost() {
        return cost;
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
