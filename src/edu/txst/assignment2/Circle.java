package edu.txst.assignment2;

/**
 * Represents a circle with a specified radius.
 *
 * This class implements the Shape interface and
 * provides methods to calculate the area of a circle
 * and display its information.
 *
 * @author Pujan Mijar
 * @version 1.0
 */
public class Circle implements Shape {

    /** The radius of the circle. */
    private double radius;

    /**
     * Constructs a Circle object with the given radius.
     *
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * The area is calculated using PI multiplied
     * by the square of the radius.
     *
     * @return the calculated area of the circle
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns the class name of the circle.
     *
     * @return the string "Circle"
     */
    @Override
    public String getClassName() {
        return "Circle";
    }

    /**
     * Returns a string representation of the circle.
     *
     * @return the circle's radius information
     */
    @Override
    public String toString() {
        return "Circle (radius = " + radius + ")";
    }
}