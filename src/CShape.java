package src;

/**
 * Abstract base class for all shapes.
 * @author Calder Johnson.
 */
public abstract class CShape {
    /**
     * Keeps track of how many shapes have been created.
     */
    private static int idCounter = 0;

    /**
     * Unique identifier for each shape.
     */
    protected int id;

    /**
     * Base constructor for all shapes, sets ID attribute.
     */
    public CShape() {
        idCounter++;
        this.id = idCounter;
    }

    /**
     * Renders a string representation of this shape.
     * @return String representation of this shape.
     */
    public abstract String toString();
}
