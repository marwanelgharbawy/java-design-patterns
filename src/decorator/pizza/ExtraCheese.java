package decorator.pizza;

public class ExtraCheese extends ToppingsDecorator {

    public ExtraCheese(PizzaI newPizza) {
        super(newPizza);
        System.out.println("Adding extra cheese");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese"; // Adding extra cheese to the description
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.50; // Extra cheese costs 1.50
    }
}