package decorator.pizza;

public class Olives extends ToppingsDecorator {

    public Olives(PizzaI newPizza) {
        super(newPizza);
        System.out.println("Adding olives");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives"; // Adding olives to the description
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 0.50; // Olives cost 0.50
    }
}