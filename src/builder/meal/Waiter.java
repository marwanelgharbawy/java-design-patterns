package builder.meal;

public class Waiter {
    private ShawermaBuilder builder;

    public Waiter(ShawermaBuilder mealBuilder) {
        this.builder = mealBuilder;
    }

    public Shawerma constructShawerma() {
        builder.buildCore();
        builder.buildSauce();
        builder.buildExtra();
        return builder.getShawerma();
    }
}
