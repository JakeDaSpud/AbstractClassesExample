package dkit.oop;   // Oct 2023

import java.util.ArrayList;

/**
 * Abstract class Shape
 * oop-abstract-class-shape
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Abstract Class Shape" );
        App app = new App();
        app.start();
    }

    public void start() {

        // We cannot create an object of an Abstract class.
        // (ie we cannot instantiate an Abstract class)
        //  Shape s1 = new Shape(2,3); // uncomment and note the compiler error message.
        //
        // This is sensible, because an abstract class is supposed to represent an abstraction
        // of a class of objects that stores only things common to all objects,
        // but not the full structure of any actual object types.

        Circle c1 = new Circle(1,2,5);  // instantiate a "concrete" class
        System.out.println(c1.toString());

        // The following code calls getX() and getY() on a Circle type object c1
        // These methods exist for c1, because they have been inherited in Circle
        // from the Shape class.
        System.out.println("Circle c1: x=" + c1.getX() + ", y="+c1.getY());


        // implement the Rectangle class (see skeleton Rectangle class).
        //Done??

        // instantiate a Rectangle object r1, and output its details.
        Rectangle r1 = new Rectangle(10, 5, 13, 7.5);
        System.out.println(r1.toString());
        System.out.println("Rectangle r1: x=" + r1.getX() + ", y="+r1.getY());

        // create an ArrayList and populate it with two Circles and two Rectangles.
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(r1);

        Circle c2 = new Circle(5,-10,8);
        Rectangle r2 = new Rectangle(-20, -8, 3, 5);

        shapes.add(c2);
        shapes.add(r2);

        // write a displayList() method that accepts the list and display all elements.
        //Look at line 77
        System.out.println("Showing all elements in ArrayList:");
        displayList(shapes);

        // using a for loop, sum the area of all the shapes and output that sum.
        //I have to have areaOut outside of the loop right?? Otherwise it resets every time the loop runs
        double areaOut = 0;
        for (Shape s: shapes) {
            areaOut += s.area();
            System.out.println(areaOut);
        }

        // The senior architect informs you that all shapes MUST have a method
        // called perimeter() that returns the perimeter of the shape.
        // Make the appropriate changes to the Shape, Circle and Rectangle classes.
        //Already did it for Rectangle before i even saw this 😎
        //I do not know how the perimeter of a circle is calculated: nvm it's 2 * (pi * r)
    }

    // write a displayList() method that accepts the list and display all elements.
    public void displayList(ArrayList<Shape> inputList) {
        for (Shape s: inputList) {
            System.out.println(s.toString());
        }
    }
}
