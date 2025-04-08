import javafx.scene.shape.Circle;

public class Main {
    public static void main(String[] args) {

        circle c = new circle(1.0);
            c.displayShapeType();
        System.out.println("the Circle  Area is "+c.calculateArea());

        Rectangle r = new Rectangle(4, 3.4);
        c.displayShapeType();
         System.out.println("the Rectagle Area is "+r.calculateArea());
       Robot ro = new Robot();
       ro.move();
       ro.draw();

    }
}