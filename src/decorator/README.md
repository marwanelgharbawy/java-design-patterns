# Decorator Design Pattern

## Step 1: Define the Component Interface

Create an interface or abstract class that defines the common methods that both the concrete component (the base class) and the decorators (the additional features) will implement.
```java
public interface Beverage { // The common interface
    double cost();
}
```


## Step 2: Create a Concrete Component

Implement the interface or extend the abstract class in the concrete class that represents the base object. This is the simplest form of the component.

```java
public class Coffee implements Beverage { // The base object
    @Override
    public double cost() {
        return 5.00;  // base cost of coffee
    }
}
```

## Step 3: Create the Decorator Base Class

Create an abstract class that implements the same interface (or extends the same abstract class) and holds a reference to a `Component` object. 

This allows the decorator to wrap around any `Component`.

```java
public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage; // The component to be decorated, this type is the same as the interface

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract double cost();
}
```


## Step 4: Create Concrete Decorators

Create concrete decorators that extend the base decorator class. 

Each decorator will add new behavior to the component, such as adding additional costs, modifying behavior, or adding new methods.

### Milk Decorator

```java
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.00;  // Add cost of the base beverage + cost of milk
    }
}
```

### Sugar Decorator

```java
public class Sugar extends CondimentDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;  // Add cost of sugar to the cost of hte base beverage
    }
}
```

### WhippedCream Decorator

```java
public class WhippedCream extends CondimentDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.50;  // Add cost of whipped cream
    }
}
```

## Step 5: Use the Decorators

In the main program, create a `Coffee` object and decorate it with different condiments like `Milk`, `Sugar`, and `WhippedCream`.

To decorate the base object, pass the base object to the constructor of the decorator object.

```java
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Coffee();  // Base object
        System.out.println("Cost of coffee: " + beverage.cost());

        beverage = new Milk(beverage);  // Adding features
        System.out.println("Cost of coffee with milk: " + beverage.cost());

        beverage = new Sugar(beverage); 
        System.out.println("Cost of coffee with milk and sugar: " + beverage.cost());

        beverage = new WhippedCream(beverage);
        System.out.println("Cost of coffee with milk, sugar, and whipped cream: " + beverage.cost());
    }
}
```

## Example Output

```
Cost of coffee: 5.0
Cost of coffee with milk: 6.0
Cost of coffee with milk and sugar: 6.5
Cost of coffee with milk, sugar, and whipped cream: 8.0
```

## Summary

- **Step 1**: Define the component **interface** `Beverage` that both the concrete component and the decorators will implement.
- **Step 2**: Create a concrete component that represents the base object (`Coffee`).
- **Step 3**: Create an **abstract** decorator base class (`CondimentDecorator`) that holds a reference to the component object.
- **Step 4**: Create concrete decorators (`Milk`, `Sugar`, `WhippedCream`) that extend the base decorator class and add new behavior.
- **Step 5**: Use the decorators to add new features to the base object in the main program.
