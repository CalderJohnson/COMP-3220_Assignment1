package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Canvas containing a collection of shapes.
 * @author Calder Johnson
 */
public class CCanvas {
    /**
     * Internal list containing all shapes on the canvas.
     */
    private List<CShape> shapes;

    /**
     * Constructor that initializes a new canvas.
     * 10 random shapes are initialized.
     * During generation, sets of dimensions that have already been initialized are kept track of to ensure all shapes are unique.
     */
    public CCanvas() {
        this.shapes = new ArrayList<>();
        List<int[]> dimensionsGenerated = new ArrayList<int[]>();
        Random rand = new Random();
        
        int shapeType;
        int xDim;
        int yDim;
        boolean duplicateShape = false;

        for (int i = 0; i < 10; i++) {
            while (true) {
                duplicateShape = false;
                shapeType = rand.nextInt(4);
                xDim = 1 + rand.nextInt(100);
                yDim = 1 + rand.nextInt(100);
                for (int j = 0; j < i; j++) {
                    int[] dimensions = dimensionsGenerated.get(j);
                    if (shapeType > 2) {
                        if ((dimensions[0] == shapeType && dimensions[1] == xDim && dimensions[2] == yDim) || 
                            (shapeType > 1 && ((dimensions[0] == shapeType && dimensions[1] == xDim)))) {
                            duplicateShape = true;
                            break;
                        }
                    }
                }
                if (duplicateShape) {
                    continue;
                }
                int[] newDimensions = {shapeType, xDim, yDim};
                dimensionsGenerated.add(newDimensions);
                break;
            }
            CShape shape;
            switch(shapeType) {
                case 0:
                    shape = new CRectangle(xDim, yDim);
                    break;
                case 1:
                    shape = new COval(xDim, yDim);
                    break;
                case 2:
                    shape = new CSquare(xDim);
                    break;
                default:
                    shape = new CCircle(xDim);
                    break;
            }
            this.addShape(shape);
        }
    }

    /**
     * Adds a new shape to the canvas.
     * @param shape New shape to add to the canvas.
     */
    public void addShape(CShape shape) {
        this.shapes.add(shape);
    }

    /**
     * Get a shape from the canvas.
     * @param index Index of shape to retrieve from the canvas.
     * @return Shape at that index in the canvas.
     */
    public CShape getShape(int index) {
        if (shapes.size() <= index) {
            System.out.println("Error: Invalid index when fetching shape from canvas!");
            return null;
        }
        return this.shapes.get(index);
    }
}