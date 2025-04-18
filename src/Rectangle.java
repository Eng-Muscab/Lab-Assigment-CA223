public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

//    @Override
//    void displayShapeType() {
//        super.displayShapeType();
//        System.out.println("the Rectagle Area is "+getWidth());
//    }
}
