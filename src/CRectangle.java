package src;

/**
 * Represents a rectangle shape.
 * @author Calder Johnson.
 */
public class CRectangle extends CShape {
    /**
     * The length of the rectangle.
     */
    protected int length;

    /**
     * The width of the rectangle.
     */
    protected int width;

    /**
     * Constructor that initializes a new rectangle shape, sets side dimensions.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    public CRectangle(int length, int width) {
        super();
        this.setLength(length);
        this.setWidth(width);
    }

    /**
     * Setter for the length of the rectangle. If width is outside of the bounds (1 -> 100) then it is restricted to that range.
     * @param length Length of the rectangle.
     */
    public void setLength(int length) {
        if (length <= 0) {
            this.length = 1;
        }
        else if (length > 100) {
            this.length = 100;
        }
        else {
            this.length = length;
        }
    }

    /**
     * Setter for the width of the rectangle. If width is outside of the bounds (1 -> 100) then it is restricted to that range.
     * @param width Width of the rectangle.
     */
    public void setWidth(int width) {
        if (width <= 0) {
            this.width = 1;
        }
        else if (width > 100) {
            this.width = 100;
        }
        else {
            this.width = width;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Shape " + this.id + ": RECTANGLE " + this.length + "x" + this.width;
    }
}
