package builder.meal;

public class Waiter {
    private MealBuilder builder;

    public Waiter(MealBuilder mealBuilder) {
        this.builder = mealBuilder;
    }

    public Meal constructMeal() {
        builder.buildMainDish();
        builder.buildSideDish();
        builder.buildDrink();
        builder.buildDessert();
        return builder.getMeal();
    }

    // Can be used to get the meal without building it
    public Meal getMeal() {
        return builder.getMeal();
    }
}
