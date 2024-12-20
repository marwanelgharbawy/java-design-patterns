package builder.meal;

public class Meal {
    private String mainDish;
    private String sideDish;
    private String dessert;
    private String drink;

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Meal:\n" +
                "mainDish: " + mainDish +
                ", sideDish: " + sideDish +
                ", dessert: " + dessert +
                ", drink: " + drink;
    }
}
