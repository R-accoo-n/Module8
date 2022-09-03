import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        Operator op = new Operator();
        op.info(new Quad());
        op.info(new Triangle());
        op.info(new Diamond());
        op.info(new Oval());
        op.info(new Circle());

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
