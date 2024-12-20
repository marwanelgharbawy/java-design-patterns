package builder.meal;

public class ComboBuilder {
    private final Meal meal = new Meal();

    public void buildMainDish(String mainDish) {
        meal.setMainDish(mainDish);
    }

    public void buildSideDish(String sideDish) {
        meal.setSideDish(sideDish);
    }

    public void buildDrink(String drink) {
        meal.setDrink(drink);
    }

    public void buildDessert(String dessert) {
        meal.setDessert(dessert);
    }

    public Meal getMeal() {
        return meal;
    }
}