package builder.meal;

public class ComboBuilder {
    private final Meal meal = new Meal();

    public void buildMainDish() {
        meal.setMainDish("Burger");
    }

    public void buildSideDish() {
        meal.setSideDish("Fries");
    }

    public void buildDrink() {
        meal.setDrink("V7 Cola");
    }

    public void buildDessert() {
        meal.setDessert("Ice Cream");
    }

    public Meal getMeal() {
        return meal;
    }
}