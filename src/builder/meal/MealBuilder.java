package builder.meal;

public interface MealBuilder {
    void buildMainDish();
    void buildSideDish();
    void buildDrink();
    void buildDessert();
    Meal getMeal();
}
