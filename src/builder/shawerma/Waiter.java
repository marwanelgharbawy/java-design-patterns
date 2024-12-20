package builder.shawerma;

public class Waiter {
    private ShawermaBuilder builder;

    public void setBuilder(ShawermaBuilder builder) {
        this.builder = builder;
    }

    public Shawerma constructShawerma() {
        builder.buildMeat();
        builder.buildSauce();
        builder.buildExtra();
        return builder.getShawerma();
    }
}
