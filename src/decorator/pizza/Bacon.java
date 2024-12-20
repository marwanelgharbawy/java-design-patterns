package decorator.pizza;

public class Bacon extends ToppingsDecorator {

    public Bacon(PizzaI newPizza) {
        super(newPizza);
        System.out.println("Adding bacon");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Bacon"; // Adding bacon to the description
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.50; // Bacon costs 1.50
    }
}