package decorator.pizza;

public class Pizza implements PizzaI { // Base class
    public String getDescription() {
        return "Pizza";
    }

    public double getCost() {
        return 10.0; // Base price
    }
}