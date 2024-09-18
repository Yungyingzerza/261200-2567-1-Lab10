import Turtles.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Read the image file
            //use absolute path
            File file = new File("/Users/yungyingzerza/Documents/GitHub/261200-2567-1-Lab01-2/backToSchool.png");
            BufferedImage image = ImageIO.read(file);

            // Step 2: Create a 2D array to store the color values of each pixel
            int width = image.getWidth();
            int height = image.getHeight();

            int startPointXAxis = 313;
            int startPointYAxis = 208;
            Color[][] pixelColors = new Color[width][height];

            //number of threads  10
            int width1 = image.getWidth()/10;
            int width2 = image.getWidth()/10*2;
            int width3 = image.getWidth()/10*3;
            int width4 = image.getWidth()/10*4;
            int width5 = image.getWidth()/10*5;
            int width6 = image.getWidth()/10*6;
            int width7 = image.getWidth()/10*7;
            int width8 = image.getWidth()/10*8;
            int width9 = image.getWidth()/10*9;
            int width10 = image.getWidth();

            Thread bob = new Thread(new Bob(pixelColors, image,0,0, width1, height, startPointXAxis, startPointYAxis, Color.BLACK));
            Thread alice = new Thread(new Alice(pixelColors, image,width1,0, width2, height, startPointXAxis, startPointYAxis, Color.RED));
            Thread alex = new Thread(new Alex(pixelColors, image,width2,0, width3, height, startPointXAxis, startPointYAxis, Color.GREEN));
            Thread steve = new Thread(new Steve(pixelColors, image,width3,0, width4, height, startPointXAxis, startPointYAxis, Color.BLUE));
            Thread john = new Thread(new John(pixelColors, image,width4,0, width5, height, startPointXAxis, startPointYAxis, Color.YELLOW));
            Thread jerry = new Thread(new Jerry(pixelColors, image,width5,0, width6, height, startPointXAxis, startPointYAxis, Color.ORANGE));
            Thread jason = new Thread(new Jason(pixelColors, image,width6,0, width7, height, startPointXAxis, startPointYAxis, Color.PINK));
            Thread jessie = new Thread(new Jessie(pixelColors, image,width7,0, width8, height, startPointXAxis, startPointYAxis, Color.CYAN));
            Thread jenny = new Thread(new Jenny(pixelColors, image,width8,0, width9, height, startPointXAxis, startPointYAxis, Color.MAGENTA));
            Thread jessica = new Thread(new Jessica(pixelColors, image,width9,0, width10, height, startPointXAxis, startPointYAxis, Color.LIGHT_GRAY));

            bob.start();
            alice.start();
            alex.start();
            steve.start();
            john.start();
            jerry.start();
            jason.start();
            jessie.start();
            jenny.start();
            jessica.start();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
