package Turtles;

public class Rectangle implements Runnable{

    private final Turtle turtle;

    public Rectangle() {
        this.turtle = new Turtle();
        this.turtle.up();
    }

    @Override
    public void run() {
        drawRectangle(0, 0, 50, 50);
    }

    private void drawRectangle(int x, int y, int width, int height) {
        turtle.setPosition(x, y);
        turtle.down();
        turtle.forward(width);
        turtle.right(90);
        turtle.forward(height);
        turtle.right(90);
        turtle.forward(width);
        turtle.right(90);
        turtle.forward(height);
        turtle.right(90);
    }
}
