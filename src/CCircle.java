package src;

/**
 * Represents a circle shape.
 * @author Calder Johnson
 */
public class CCircle extends COval {
    /**
     * Constructor that initializes a new circle shape, sets radius.
     * @param radius The radius of the circle.
     */
    public CCircle(int radius) {
        super(radius, radius);
    }

    /**
     * Getter for the radius of the circle.
     * @return The radius of the circle.
     */
    public int getRadius() {
        return horizontalRadius;
    }

    /**
     * Setter for the radius of the circle. If the radius is outside of the bounds (0 -> 100) then it is restricted to that range.
     * @param radius The radius of the circle.
     */
    public void setRadius(int radius) {
        if (radius <= 0) {
            this.horizontalRadius = 1;
            this.verticalRadius = 1;
        }
        else if (radius > 100) {
            this.horizontalRadius = 100;
            this.verticalRadius = 100;
        }
        else {
            this.horizontalRadius = radius;
            this.verticalRadius = radius;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Shape " + this.id + ": CIRCLE " + this.horizontalRadius;
    }
}
