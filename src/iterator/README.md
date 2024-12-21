# Step-by-Step Guide to Implementing the Iterator Design Pattern

The **Iterator Design Pattern** provides a way to access elements of a collection sequentially without exposing the underlying implementation. Here's how you can implement this pattern step-by-step using a simple example of iterating over a collection of animals.

---

## Step 1: Define a Collection Interface
Start by defining a collection interface that declares methods for creating an iterator.

```java
// Collection interface
public interface AnimalCollection {
    public Iterator createIterator();
}
```

---

## Step 2: Define the Iterator Interface
The iterator interface will define methods for traversing the elements of the collection.

```java
// Iterator interface
public interface Iterator {
    public boolean hasNext();
    public Object next();
}
```

---

## Step 3: Implement the Concrete Collection
Create a concrete class that implements the collection interface and holds the items to be iterated over.

```java
// Concrete collection class
import java.util.ArrayList;
import java.util.List;

public class AnimalList implements AnimalCollection {
    private List<String> animals = new ArrayList<>();

    public void addAnimal(String animal) {
        animals.add(animal);
    }

    public List<String> getAnimals() {
        return animals;
    }

    @Override
    public Iterator createIterator() {
        return new AnimalIterator(animals);
    }
}
```

---

## Step 4: Implement the Concrete Iterator
Create a concrete class that implements the iterator interface and provides the logic for traversing the collection.

```java
// Concrete iterator class
import java.util.List;

public class AnimalIterator implements Iterator {
    private List<String> animals;
    private int position = 0;

    public AnimalIterator(List<String> animals) {
        this.animals = animals;
    }

    @Override
    public boolean hasNext() {
        return position < animals.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return animals.get(position++);
        }
        return null;
    }
}
```

---

## Step 5: Use the Iterator in the Main Method
Finally, use the iterator to traverse the collection in a controlled way.

```java
// Main class to demonstrate the iterator pattern
public class AnimalMain {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        animalList.addAnimal("Cat");
        animalList.addAnimal("Dog");
        animalList.addAnimal("Bird");

        Iterator iterator = animalList.createIterator();

        System.out.println("Iterating over animals:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
```

---

## Summary
- **Step 1**: Define a collection interface (`AnimalCollection`).
- **Step 2**: Define the iterator interface (`Iterator`).
- **Step 3**: Implement a concrete collection (`AnimalList`) that stores items.
- **Step 4**: Implement a concrete iterator (`AnimalIterator`) to traverse the collection.
- **Step 5**: Use the iterator in the main method to access elements sequentially.


