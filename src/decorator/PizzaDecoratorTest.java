package decorator;

import java.util.Scanner;

import decorator.pizza.*;

public class PizzaDecoratorTest {
    public static void main(String[] args) {
        PizzaI pizza = new Pizza();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println(pizza.getDescription());
        System.out.println("Cost: " + pizza.getCost());

        do {
            System.out.println("\n1. Extra Cheese");
            System.out.println("2. Pepperoni");
            System.out.println("3. Mushrooms");
            System.out.println("4. Olives");
            System.out.println("5. Bacon");
            System.out.println("6. Tomato");
            System.out.println("0. Finish\n");
            System.out.print("Choose a topping to add:");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pizza = new ExtraCheese(pizza);
                    break;
                case 2:
                    pizza = new Pepperoni(pizza);
                    break;
                case 3:
                    pizza = new Mushrooms(pizza);
                    break;
                case 4:
                    pizza = new Olives(pizza);
                    break;
                case 5:
                    pizza = new Bacon(pizza);
                    break;
                case 6:
                    pizza = new Tomato(pizza);
                    break;
                case 0:
                    System.out.println("Final pizza:");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (choice != 0) {
                System.out.println("\nCurrent pizza: " + pizza.getDescription());
                System.out.println("Current cost: " + pizza.getCost());
            }
        } while (choice != 0);

        System.out.println("\nYour final pizza: " + pizza.getDescription());
        System.out.println("Total cost: " + pizza.getCost());

        scanner.close();
    }
}