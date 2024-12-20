package builder.meal;

public class BeefShawermaBuilder {
    private final Shawerma shawerma = new Shawerma();

    public void buildCore() {
        shawerma.setCore("Beef");
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