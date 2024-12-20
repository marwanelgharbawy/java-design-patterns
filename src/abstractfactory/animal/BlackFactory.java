package abstractfactory.animal;

public class BlackFactory implements AnimalFactory {
    public Animal getCat() {
        return new BlackCat();
    }

    public Animal getDog() {
        return new BlackDog();
    }
}