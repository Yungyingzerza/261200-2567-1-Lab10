package Turtles;

public class Circle implements Runnable{

        private final Turtle turtle;

        public Circle() {
            this.turtle = new Turtle();
            this.turtle.up();
        }

        @Override
        public void run() {
            drawCircle(-50, -50);
        }

        private void drawCircle(int x, int y) {
            turtle.setPosition(x, y);
            turtle.down();
            turtle.speed(0.005);

            for (int i = 0; i < 360; i++) {
                turtle.forward(1);
                turtle.right(1);
            }
        }
}
