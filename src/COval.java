package src;

/**
 * Represents an oval shape.
 * @author Calder Johnson.
 */
public class COval extends CShape {
    /**
     * Horizontal radius of the oval.
     */
    protected int horizontalRadius;

    /**
     * Vertical radius of the oval.
     */
    protected int verticalRadius;

    /**
     * Constructor that initializes a new oval shape, sets radii.
     * @param horizontalRadius The horizontal radius.
     * @param verticalRadius The vertical radius.
     */
    public COval(int horizontalRadius, int verticalRadius) {
        super();
        this.setHorizontalRadius(horizontalRadius);
        this.setVerticalRadius(verticalRadius);
    }

    /**
     * Getter for the horizontal radius.
     * @return Horizontal radius of the oval.
     */
    public int getHorizontalRadius() {
        return this.horizontalRadius;
    }

    /**
     * Getter for the vertical radius.
     * @return Vertical radius of the oval.
     */
    public int getVerticalRadius() {
        return this.verticalRadius;
    }

    /**
     * Setter for the horizontal radius. If radius is outside of bounds (1 -> 100) it is restricted to that range.
     * @param horizontalRadius The horizontal radius to set.
     */
    public void setHorizontalRadius(int horizontalRadius) {
        if (horizontalRadius <= 0) {
            this.horizontalRadius = 1;
        }
        else if (horizontalRadius > 100) {
            this.horizontalRadius = 100;
        }
        else {
            this.horizontalRadius = horizontalRadius;
        }
    }

    /**
     * Setter for the vertical radius. If radius is outside of bounds (1 -> 100) it is restricted to that range.
     * @param verticalRadius The vertical radius to set.
     */
    public void setVerticalRadius(int verticalRadius) {
        if (verticalRadius <= 0) {
            this.verticalRadius = 1;
        }
        else if (verticalRadius > 100) {
            this.verticalRadius = 100;
        }
        else {
            this.verticalRadius = verticalRadius;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Shape " + this.id + ": OVAL " + this.horizontalRadius + "x" + this.verticalRadius;
    }
}
