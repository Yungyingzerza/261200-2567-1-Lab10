import Turtles.Circle;
import Turtles.Rectangle;
import Turtles.Triangle;

import java.io.IOException;

public class Main_Simple {
    public static void main(String[] args) {

        try {
            Thread rectangle = new Thread(new Rectangle());
            Thread circle = new Thread(new Circle());
            Thread triangle = new Thread(new Triangle());

            rectangle.start();
            circle.start();
            triangle.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
