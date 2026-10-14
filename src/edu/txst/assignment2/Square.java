package edu.txst.assignment2;

/**
 * Represents a square with four equal sides.
 *
 * This class implements the Shape interface and
 * calculates the area using the length of one side.
 *
 * @author Pujan Mijar
 * @version 1.0
 */
public class Square implements Shape {

    /** The length of one side of the square. */
    private double side;

    /**
     * Constructs a Square object with the given side.
     *
     * @param side the length of one side of the square
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Calculates the area of the square.
     *
     * The area is calculated by multiplying
     * the side length by itself.
     *
     * @return the calculated area of the square
     */
    @Override
    public double getArea() {
        return side * side;
    }

    /**
     * Returns the class name of the square.
     *
     * @return the string "Square"
     */
    @Override
    public String getClassName() {
        return "Square";
    }

    /**
     * Returns a string representation of the square.
     *
     * @return the square's side length information
     */
    @Override
    public String toString() {
        return "Square (side = " + side + ")";
    }
}
