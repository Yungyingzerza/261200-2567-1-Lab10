package Turtles;

public class Triangle implements Runnable{

        private final Turtle turtle;

        public Triangle() {
            this.turtle = new Turtle();
            this.turtle.up();
        }

        @Override
        public void run() {
            drawTriangle(80, 20, 50);
        }

        private void drawTriangle(int x, int y, int side) {
            turtle.setPosition(x, y);
            turtle.down();
            for (int i = 0; i < 3; i++) {
                turtle.forward(side);
                turtle.right(120);
            }
        }
}
