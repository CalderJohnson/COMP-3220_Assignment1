package src;

/**
 * Represents a square shape, a type of rectangle.
 * @author Calder Johnson
 */
public class CSquare extends CRectangle {
    /**
     * Constructor that initializes a new square shape, sets side lengths.
     * @param sideLength The side length of the square.
     */
    public CSquare(int sideLength) {
        super(sideLength, sideLength);
    }

    /**
     * Getter for the side length of the square.
     * @return Side length of the square.
     */
    public int getSideLength() { 
        return this.width;
    }

    /**
     * Setter for the side length of the square. If the side length is outside of bounds (0 -> 100) it is restricted to that range.
     * @param sideLength
     */
    public void setSideLength(int sideLength) {
        if (sideLength <= 0) {
            this.width = 1;
            this.length = 1;
        }
        else if (sideLength > 100) {
            this.width = 100;
            this.length = 100;
        }
        else {
            this.width = sideLength;
            this.length = sideLength;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Shape " + this.id + ": SQUARE " + this.length + "x" + this.width;
    }
}
