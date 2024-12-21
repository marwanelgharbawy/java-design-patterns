package iterator.animal;

import java.util.ArrayList;

public class AnimalList implements AnimalCollection {
    private ArrayList<String> animals = new ArrayList<>();

    public void addAnimal(String animal) {
        animals.add(animal);
    }

    public void removeAnimal(String animal) {
        animals.remove(animal);
    }

    public ArrayList<String> getAnimals() {
        return animals;
    }

    @Override
    public Iterator createIterator() {
        return new AnimalIterator(animals);
    }

    @Override
    public Iterator createReverseIterator() {
        return new ReverseAnimalIterator(animals);
    }
}