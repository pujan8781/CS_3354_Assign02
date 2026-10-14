package edu.txst.assignment2;

/**
 * Represents a triangle with a base and height.
 *
 * This class implements the Shape interface and
 * calculates the area using the base and height
 * of the triangle.
 *
 * @author Pujan Mijar
 * @version 1.0
 */
public class Triangle implements Shape {

    /** The base of the triangle. */
    private double base;

    /** The height of the triangle. */
    private double height;

    /**
     * Constructs a Triangle object with the
     * specified base and height.
     *
     * @param base the base of the triangle
     * @param height the height of the triangle
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Calculates the area of the triangle.
     *
     * The area is calculated by multiplying
     * the base and height, then dividing by two.
     *
     * @return the calculated area of the triangle
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /**
     * Returns the class name of the triangle.
     *
     * @return the string "Triangle"
     */
    @Override
    public String getClassName() {
        return "Triangle";
    }

    /**
     * Returns a string representation of the triangle.
     *
     * @return the triangle's base and height information
     */
    @Override
    public String toString() {
        return "Triangle (base = " + base
                + ", height = " + height + ")";
    }
}
