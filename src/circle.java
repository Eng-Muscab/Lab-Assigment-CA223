public class circle extends Shape{
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14*radius*radius;
    }

//    @Override
//    void displayShapeType() {
//        super.displayShapeType();
//        System.out.println("Circle Area "+getRadius());
//    }
}
