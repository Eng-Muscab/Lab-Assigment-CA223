public class Robot implements Moviable, Drawable{
    @Override
    public void draw() {
        System.out.println("Robot is moving");
    }

    @Override
    public void move() {
        System.out.println("Robot is drawing");

    }
}
