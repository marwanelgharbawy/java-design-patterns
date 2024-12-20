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
    private static final HashMap<String, AngryBird> angrybirdMap = new HashMap<>();

    public static Bird getAngryBird(String color) {
        AngryBird angrybird = (AngryBird) angrybirdMap.get(color); // Either null or an object

        if (angrybird == null) { // If object does not exist, create one
            angrybird = new AngryBird(color);
            angrybirdMap.put(color, angrybird);
            System.out.println("Creating Angry Bird of color: " + color);
        }
        return angrybird; // Return the object if it exists in map
    }
}
```