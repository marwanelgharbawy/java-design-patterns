package decorator;

import decorator.pizza.*;

public class Main {
    public static void main(String[] args) {
        PizzaI pizza = new Pizza();

        pizza = new ExtraCheese(pizza);
        pizza = new Pepperoni(pizza);
        pizza = new Mushrooms(pizza);

        System.out.println(pizza.getDescription());
        System.out.println("Cost: " + pizza.getCost());
    }
}
