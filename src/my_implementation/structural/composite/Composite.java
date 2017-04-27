package my_implementation.structural.composite;

import java.util.ArrayList;

/**
 * Created by thomaspan on 4/26/17.
 */
public class Composite implements Shape {
    private ArrayList<Shape> shapes;

    public Composite() {
        this.shapes = new ArrayList<>();
    }

    @Override
    public void whoIs() {
        for (Shape shape : shapes) {
            shape.whoIs();
        }
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }
}
