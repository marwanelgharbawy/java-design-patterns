package iterator;

import iterator.animal.*;

public class TestAnimalIterator {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        animalList.addAnimal("Cat");
        animalList.addAnimal("Dog");
        animalList.addAnimal("Bird");

        // Forward iteration
        Iterator iterator = animalList.createIterator();
        System.out.println("Iterating over animals (forward):");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Reverse iteration
        Iterator reverseIterator = animalList.createReverseIterator();
        System.out.println("Iterating over animals (reverse):");

        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}