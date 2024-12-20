package flyweight;

import flyweight.bird.*;

public class TestAngryBirds {
    private static final String[] colors = { "Red", "Orange", "Blue", "Yellow", "Pink" };

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Bird angrybird = BirdFactory.getAngryBird(getRandomColor());
            angrybird.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}