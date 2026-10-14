package edu.txst.assignment2;

/**
 * The Shape interface defines the common behavior
 * for different geometric shapes.
 *
 * Every class implementing this interface must
 * calculate its area and return its class name.
 *
 * @author Pujan Mijar
 * @version 1.0
 */
public interface Shape {

    /**
     * Calculates and returns the area of the shape.
     *
     * @return the area of the shape as a double
     */
    double getArea();

    /**
     * Returns the name of the shape class.
     *
     * @return the name of the shape
     */
    String getClassName();
}