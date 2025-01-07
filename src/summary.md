## Strategy Pattern

- **Step 1**: Define the strategy **interface** (`Strategy`) with a method that all concrete strategies will implement.
- **Step 2**: Implement concrete strategies **classes** (`ConcreteStrategyA`, `ConcreteStrategyB`) that implement the strategy interface.
- **Step 3**: Create a context **class** (`Context`) that uses the strategy interface and can change the strategy at runtime.
- **Step 4**: Implement the main program to test the context class with different strategies.

You should end up with 1 **class** for context, **1 interface** for all strategies, and **some classes** for each strategy.

[Learn more](https://github.com/marwanelgharbawy/java-design-patterns/blob/master/src/strategy/README.md)

## Decorator Pattern

- **Step 1**: Define the component **interface** `Beverage` that both the concrete component and the decorators will implement.
- **Step 2**: Create a concrete component **class** representing the base object (`Coffee`).
- **Step 3**: Create an **abstract class** of decorator base (`CondimentDecorator`) that holds a reference to the component object.
- **Step 4**: Create concrete decorators **classes** (`Milk`, `Sugar`, `WhippedCream`) that extend the base decorator class and add new behavior.

You should end up with **1 interface**, **1 class** for the base object, **1 abstract class** for the decorator base, and **some classes** implementing it as decorations.

[Learn more](https://github.com/marwanelgharbawy/java-design-patterns/blob/master/src/decorator/README.md)

## Flyweight Pattern

- **Step 1**: Define the flyweight **interface** (`Bird`) which will be implemented by all flyweight objects.
- **Step 2**: Implement the flyweight **class** (`AngryBird`) that represents a concrete flyweight object.
- **Step 3**: Create the flyweight factory **class** (`BirdFactory`) that ensures only one object per color is created and shared.

You should end up with **1 interface**, **1 class** representing the flyweight object, **1 class** for the flyweight factory.

[Learn more](https://github.com/marwanelgharbawy/java-design-patterns/blob/master/src/flyweight/README.md)

## Builder Pattern

- **Step 1**: Define the product **class** (`Car`) representing the complex object being built, containing all its parts.
- **Step 2**: Create the builder **interface** (`CarBuilder`). Define methods to set each part of the product and a method to return the final product.
- **Step 3**: Implement the concrete builder **class** (`SportsCarBuilder`) to assemble the product step by step.
- **Step 4**: Create the director **class** (`CarDirector`) to ensure the product is constructed in a specific sequence using a director class.

You should end up with **1 class** for the complex object, **1 interface**, **some classes** of builders implementing the interface, and **1 class** as a director.

[Learn more](https://github.com/marwanelgharbawy/java-design-patterns/blob/master/src/builder/README.md)

## Abstract Factory Pattern

- **Step 1**: Define a common **interface** (`Animal`).
- **Step 2**: Create **abstract classes** (`Cat` and `Dog`) for categories.
- **Step 3**: Implement concrete **classes** for specific products (`BlackCat`, `WhiteCat`, `BlackDog`, `WhiteDog`).
- **Step 4**: Define a factory **interface** (`AnimalFactory`) that declares methods to create different types of objects.
- **Step 5**: Implement concrete factories **classes** (`BlackFactory`, `WhiteFactory`) that instantiate specific products.

You should end up with **2 interfaces**, **at least 2 abstract classes** for categories, **at least 4 classes** for products extending the the category abstract classes and implementing the common interface, **at least 2 classes** for factories implementing the factory interface.

[Learn more](https://github.com/marwanelgharbawy/java-design-patterns/blob/master/src/abstractfactory/REAMDE.md)

## Iterator Pattern

- **Step 1**: Define a collection **interface** (`AnimalCollection`).
- **Step 2**: Define the iterator **interface** (`Iterator`).
- **Step 3**: Implement a concrete collection **class** (`AnimalList`) that stores items and supports different iterators.
- **Step 4**: Implement concrete iterators **classes** (`AnimalIterator` and `ReverseAnimalIterator`) for different traversal methods.

You should end up with **2 interfaces**, **1 class** for collection, and **at least 1 class** for iterators.

[Learn more](https://github.com/marwanelgharbawy/java-design-patterns/blob/master/src/iterator/README.md)
