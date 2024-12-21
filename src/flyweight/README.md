# Flyweight Pattern

## Step 1: Define the Flyweight Interface

Create an interface. This interface will define the method that each flyweight object must implement.

```java
public interface Bird {
    void draw();
}
```

## Step 2: Implement the Flyweight Class

Create a class called that implements the created interface. This class will represent a concrete flyweight object.

```java
public class AngryBird implements Bird {
    private String color;

    public AngryBird(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Angry Bird: Draw() [Color: " + color + "]");
    }
}
```

## Step 3: Create the Flyweight Factory

The factory class will ensure that only one object per color is created and shared. 

If an object of the requested color already exists, it will be reused.

```java
import java.util.HashMap;

public class BirdFactory {
    private static final HashMap<String, AngryBird> angryBirdMap = new HashMap<>();

    public static Bird getAngryBird(String color) {
        AngryBird angryBird = angryBirdMap.get(color); // Either null or an object

        if (angryBird == null) { // If object does not exist, create one
            angryBird = new AngryBird(color);
            angryBirdMap.put(color, angryBird);
            System.out.println("Creating Angry Bird of color: " + color);
        }
        return angryBird; // Return the object if it exists in map
    }
}
```

## Summary

- **Step 1**: Define the flyweight **interface** (`Bird`) which will be implemented by all flyweight objects.
- **Step 2**: Implement the flyweight **class** (`AngryBird`) that represents a concrete flyweight object.
- **Step 3**: Create the flyweight factory **class** (`BirdFactory`) that ensures only one object per color is created and shared.