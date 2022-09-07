import classes.*;
import abstractions.Shape;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        Operator op = new Operator();
        op.giveInfo(new Quad());
        op.giveInfo(new Triangle());
        op.giveInfo(new Diamond());
        op.giveInfo(new Oval());
        op.giveInfo(new Circle());

        System.out.println("");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Quad());
        shapes.add(new Triangle());
        shapes.add(new Diamond());
        shapes.add(new Oval());
        shapes.add(new Circle());

        op.listInfo(shapes);

    }
}
