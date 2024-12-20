package abstractfactory.animal;

public class WhiteFactory implements AnimalFactory {
    public Animal getCat() {
        return new WhiteCat();
    }

    public Animal getDog() {
        return new WhiteDog();
    }
}