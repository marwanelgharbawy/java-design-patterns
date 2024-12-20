package decorator.pizza;

public class Mushrooms extends ToppingsDecorator {

    public Mushrooms(PizzaI newPizza) {
        super(newPizza);
        System.out.println("Adding mushrooms");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 0.75;
    }
}