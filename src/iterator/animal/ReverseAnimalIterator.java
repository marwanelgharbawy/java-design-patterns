package iterator.animal;

import java.util.ArrayList;

public class ReverseAnimalIterator implements Iterator {
    private ArrayList<String> animals;
    private int index;

    public ReverseAnimalIterator(ArrayList<String> animals) {
        this.animals = animals;
        index = animals.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return animals.get(index--);
        }
        return null;
    }
}