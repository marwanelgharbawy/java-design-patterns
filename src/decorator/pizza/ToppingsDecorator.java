package decorator.pizza;

public abstract class ToppingsDecorator implements PizzaI { // Decorator base class
    protected PizzaI pizza;

    public ToppingsDecorator(PizzaI newPizza) {
        pizza = newPizza;
    }

    public abstract String getDescription();

    public abstract double getCost();
}
