package builder.shawerma;

public class Waiter {
    private ShawermaBuilder builder;

    public Waiter(ShawermaBuilder mealBuilder) {
        this.builder = mealBuilder;
    }

    public Shawerma constructShawerma() {
        builder.buildMeat();
        builder.buildSauce();
        builder.buildExtra();
        return builder.getShawerma();
    }
}
