import java.util.List;

public class Operator {
    public void info(Shape shape){
        shape.giveInfo();
    }

    public void listInfo(List<? extends Shape> shapes){
        for(Shape shape : shapes){
            shape.giveInfo();
        }
    }
}
