package iterator.animal;

import java.util.ArrayList;

public class AnimalIterator implements Iterator {
    private ArrayList<String> animals;
    private int index = 0;

    public AnimalIterator(ArrayList<String> animals) {
        this.animals = animals;
    }

    @Override
    public boolean hasNext() {
        return index < animals.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return animals.get(index++);
        }
        return null;
    }
}