# Factory Design Pattern

The **Factory Design Pattern** provides a way to create objects without specifying their exact class.

---

## Step 1: Define a Common Interface
Start by defining a common interface that all products will implement. This ensures a common type for all objects created by the factory.

```java
// Common interface for all animals
public interface Animal {
    public void ItsName();
}
```

---

## Step 2: Create Abstract Classes for Categories
If there are categories within your products, you can define abstract classes that implement the interface. These will act as base classes for specific types.

```java
// Abstract class for Cats
public abstract class Cat implements Animal {
    public abstract void ItsName();
}

// Abstract class for Dogs
public abstract class Dog implements Animal {
    public abstract void ItsName();
}
```

---

## Step 3: Implement Concrete Classes for Specific Products
Now, create concrete classes that extend the abstract classes or directly implement the interface. Each class represents a specific type of product.

```java
// Concrete class for BlackCat
public class BlackCat extends Cat {
    public void ItsName() {
        System.out.println("I am a black cat");
    }
}

// Concrete class for WhiteCat
public class WhiteCat extends Cat {
    public void ItsName() {
        System.out.println("I am a white cat");
    }
}

// Concrete class for BlackDog
public class BlackDog extends Dog {
    public void ItsName() {
        System.out.println("I am a black dog");
    }
}

// Concrete class for WhiteDog
public class WhiteDog extends Dog {
    public void ItsName() {
        System.out.println("I am a white dog");
    }
}
```

---

## Step 4: Define a Factory Interface
Define an interface for the factory. This interface declares the methods to create different types of objects.

```java
// Factory interface to create animals
public interface AnimalFactory {
    public Animal getCat();
    public Animal getDog();
}
```

---

## Step 5: Implement Concrete Factories
Create concrete factory classes that implement the factory interface. Each factory produces a specific set of products.

```java
// Factory for creating black animals
public class BlackFactory implements AnimalFactory {
    public Animal getCat() {
        return new BlackCat();
    }

    public Animal getDog() {
        return new BlackDog();
    }
}

// Factory for creating white animals
public class WhiteFactory implements AnimalFactory {
    public Animal getCat() {
        return new WhiteCat();
    }

    public Animal getDog() {
        return new WhiteDog();
    }
}
```

---

## Step 6: Use the Factories in the Main Method
Finally, use the factories to create and use the objects without worrying about their concrete classes.

```java
// Main class to demonstrate the factory pattern
public class AnimalMain {
    public static void main(String[] args) {
        // Create a factory for black animals
        AnimalFactory af1 = new BlackFactory();
        Animal cat = af1.getCat();
        cat.ItsName(); // Output: I am a black cat
        Animal dog = af1.getDog();
        dog.ItsName(); // Output: I am a black dog

        // Create a factory for white animals
        AnimalFactory af2 = new WhiteFactory();
        Animal cat1 = af2.getCat();
        cat1.ItsName(); // Output: I am a white cat
        Animal dog1 = af2.getDog();
        dog1.ItsName(); // Output: I am a white dog
    }
}
```

---

## Summary
- **Step 1**: Define a common interface (`Animal`).
- **Step 2**: Create abstract classes (`Cat` and `Dog`) for categories.
- **Step 3**: Implement concrete classes for specific products (`BlackCat`, `WhiteCat`, `BlackDog`, `WhiteDog`).
- **Step 4**: Define a factory interface (`AnimalFactory`).
- **Step 5**: Implement concrete factories (`BlackFactory`, `WhiteFactory`).
- **Step 6**: Use the factories to create objects in the main method.

This approach allows you to create objects dynamically while maintaining a clean and scalable design.

