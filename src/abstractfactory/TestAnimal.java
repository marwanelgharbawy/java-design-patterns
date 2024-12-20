package abstractfactory;

import abstractfactory.animal.*;

public class TestAnimal {
    public static void main(String[] args) {
        AnimalFactory af1 = new BlackFactory();
        Animal cat = af1.getCat();
        cat.ItsName();
        Animal dog = af1.getDog();
        dog.ItsName();

        AnimalFactory af2 = new WhiteFactory();
        Animal cat1 = af2.getCat();
        cat1.ItsName();
        Animal dog1 = af2.getDog();
        dog1.ItsName();
    }
}