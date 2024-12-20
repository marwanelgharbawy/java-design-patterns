package flyweight.bird;

import java.util.HashMap;

public class BirdFactory {
    private static final HashMap<String, AngryBird> angryBirdMap = new HashMap<>();

    public static Bird getAngryBird(String color) {
        AngryBird angryBird = angryBirdMap.get(color);

        if (angryBird == null) {
            angryBird = new AngryBird(color);
            angryBirdMap.put(color, angryBird);
            System.out.println("Creating Angry Bird of color: " + color);
        }
        return angryBird;
    }
}