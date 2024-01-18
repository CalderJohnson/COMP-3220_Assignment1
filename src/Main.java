package src;

/**
 * Main driver class.
 * @author Calder Johnson
 */
public class Main {
    /**
     * Initializes a canvas with 10 random shapes and displays them.
     */
    public static void main(String[] args) {
        CCanvas canvas = new CCanvas();
        for (int i = 0; i < 10; i++) {
            System.out.println(canvas.getShape(i).toString() + "\n");
        }
    }
}