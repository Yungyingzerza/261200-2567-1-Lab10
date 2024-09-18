package Turtles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Jerry extends SuperTurtle {
    public Jerry(Color[][] imgArray, BufferedImage image, int startPointXAxis, int startPointYAxis, int endX, int endY, int offsetX, int offsetY, Color turtleColor) {
        super(imgArray, image, startPointXAxis, startPointYAxis, endX, endY, offsetX, offsetY, turtleColor);
    }
}
