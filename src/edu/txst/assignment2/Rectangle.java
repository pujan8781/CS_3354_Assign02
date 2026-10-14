package edu.txst.assignment2;

/**
 * Represents a rectangle with a width and length.
 *
 * This class implements the Shape interface and
 * calculates the area using the rectangle's dimensions.
 *
 * @author Pujan Mijar
 * @version 1.0
 */
public class Rectangle implements Shape {

    /** The width of the rectangle. */
    private double width;

    /** The length of the rectangle. */
    private double length;

    /**
     * Constructs a Rectangle object with the
     * specified width and length.
     *
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * The area is calculated by multiplying
     * the width by the length.
     *
     * @return the calculated area of the rectangle
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Returns the class name of the rectangle.
     *
     * @return the string "Rectangle"
     */
    @Override
    public String getClassName() {
        return "Rectangle";
    }

    /**
     * Returns a string representation of the rectangle.
     *
     * @return the rectangle's width and length information
     */
    @Override
    public String toString() {
        return "Rectangle (width = " + width
                + ", length = " + length + ")";
    }
}