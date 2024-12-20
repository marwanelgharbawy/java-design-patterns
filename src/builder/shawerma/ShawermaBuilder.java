package builder.shawerma;

public interface ShawermaBuilder {
    void buildMeat();
    void buildSauce();
    void buildExtra();
    Shawerma getShawerma();
}
