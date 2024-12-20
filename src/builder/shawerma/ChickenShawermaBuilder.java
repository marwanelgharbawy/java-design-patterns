package builder.shawerma;

public class ChickenShawermaBuilder implements ShawermaBuilder {
    private final Shawerma shawerma = new Shawerma();

    public void buildMeat() {
        shawerma.setMeat("Chicken");
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