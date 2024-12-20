package builder.shawerma;

public class BeefShawermaBuilder implements ShawermaBuilder {
    private final Shawerma shawerma = new Shawerma();

    public void buildMeat() {
        shawerma.setMeat("Beef");
    }

    public void buildSauce() {
        shawerma.setSauce("Tahina");
    }

    public void buildExtra() {
        shawerma.setExtra("Salad");
    }

    public Shawerma getShawerma() {
        return shawerma;
    }
}