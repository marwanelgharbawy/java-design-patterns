package builder.meal;

public class ChickenShawermaBuilder {
    private final Shawerma shawerma = new Shawerma();

    public void buildCore() {
        shawerma.setCore("Chicken");
    }

    public void buildSauce() {
        shawerma.setSauce("Tomiya");
    }

    public void buildExtra() {
        shawerma.setExtra("Pickles");
    }

    public Shawerma getShawerma() {
        return shawerma;
    }
}