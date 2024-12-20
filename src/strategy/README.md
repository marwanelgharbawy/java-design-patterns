# Strategy Design Patten

## Step 1: Define the Strategy Interface
Create an interface with the method that will be implemented by all concrete strategies.

```java
public interface Strategy {
    void execute(); // Or any other return type
}
```

## Step 2: Implement Concrete Strategies
Implement concrete classes that implement the `Strategy` interface.

Each strategy will implement the `execute` method.

```java
public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing Concrete Strategy A");
    }
}

public class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing Concrete Strategy B");
    }
}
```

## Step 3: Create the Context Class
Create a class that will use the strategy interface.

Add a method to set the strategy at runtime.

Add a method execute method that will call the strategy's execute method.

```java
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}
```

## Step 4: Implement the Main Program

Instantiate the context class, this will be used to set the strategy and execute it.

Set different strategies and test the context class.

```java

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA()); // Set the strategy at runtime
        context.executeStrategy();

        context = new Context(new ConcreteStrategyB()); // Change the strategy at runtime
        context.executeStrategy();
    }
}
```