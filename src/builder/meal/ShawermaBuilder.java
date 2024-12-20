package builder.meal;

public interface ShawermaBuilder {
    void buildCore();
    void buildSauce();
    void buildExtra();
    Shawerma getShawerma();
}
