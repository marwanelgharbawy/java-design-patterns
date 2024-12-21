# Builder Design Pattern

## Step 1: Define the Product
Create a class that represents the complex object being built (e.g., `Car`, `Pizza`, `Computer`). 

This class will contain all the parts that make up the object.

```java
public class Car {
    private String engine;
    private String wheels;
    private String color;

    // Getters and setters
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", color=" + color + "]";
    }
}
```

## Step 2: Create the Builder Interface
Create a builder interface with methods to set each part of the product and a `build()` method to return the final product.

```java
public interface CarBuilder {
    void buildEngine();
    void buildWheels();
    void buildColor();
    Car getResult();
}
```

## Step 3: Implement the Concrete Builder
Create a concrete builder (and more) that implements the builder interface and assembles the product step by step.

```java
public class SportsCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void buildEngine() {
        car.setEngine("V8 Engine");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Sport Wheels");
    }

    @Override
    public void buildColor() {
        car.setColor("Red");
    }

    @Override
    public Car getResult() {
        return car;
    }
}
```

## Step 4: Create the Director
The director class is optional. It ensures that the product is constructed in a specific order.


```java
public class CarDirector {
    private CarBuilder builder;
    
    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructCar() {
        builder.buildEngine();
        builder.buildWheels();
        builder.buildColor();
        return builder.getResult();
    }
}
```

## Step 5: Use the Builder
In the main program, create a builder, set the desired parts, and use the director to build the product.

```java
public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new SportsCarBuilder();
        CarDirector director = new CarDirector(builder);
        Car car = director.constructCar();

        System.out.println(car);
    }
}
```

---

## Summary
- **Step 1**: Define the product (`Car`) representing the complex object being built, containing all its parts.
- **Step 2**: Create the builder interface (`CarBuilder`). Define methods to set each part of the product and a method to return the final product.
- **Step 3**: Implement the concrete builder (`SportsCarBuilder`) to assemble the product step by step.
- **Step 4**: Create the director (`CarDirector`) to ensure the product is constructed in a specific sequence using a director class.
- **Step 5**: Create a builder in the main method, optionally use a director, and build the product.