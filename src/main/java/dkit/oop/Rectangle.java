package dkit.oop;

public class Rectangle extends Shape {

    // Rectangle requires fields 'width' and 'height'.
    // additional fields specific to Rectangle
    private double width;
    private double height;

    public Rectangle(int x, int y, double width, double height) {
        super(x, y); //calls the superclass constructor to initialize x and y.
        this.width = width;
        this.height = height;
    }

    // implement toString() and getters/setters.
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // implement the area() method that is inherited from Shape
    @Override
    public double area() {
        return (this.getX() * this.getY());
    }

    public double perimeter() {
        return ((this.getWidth() * 2) + (this.getHeight() * 2));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                "height=" + height +
                "} " + super.toString(); // call superclass toString method to get Shape details
    }
    //     note that we can't directly access the values of x and y from this class, because
    // they are defined as private in the Shape superclass. So, we let the toString() of Shape
    // do the work for us, as it can access x and y.
}
