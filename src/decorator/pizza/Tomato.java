package decorator.pizza;

public class Tomato extends ToppingsDecorator {

    public Tomato(PizzaI newPizza) {
        super(newPizza);
        System.out.println("Adding tomato");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato"; // Adding tomato to the description
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 0.40; // Tomato costs 0.40
    }
}