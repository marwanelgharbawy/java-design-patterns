package decorator.pizza;

public class Pepperoni extends ToppingsDecorator {

    public Pepperoni(PizzaI newPizza) {
        super(newPizza); // Constructor of the base class, which sets the pizza
        System.out.println("Adding pepperoni");
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni"; // Adding pepperoni to the description
    }

    public double getCost() {
        return pizza.getCost() + 1.0; // Pepperoni costs 1.0
    }
}