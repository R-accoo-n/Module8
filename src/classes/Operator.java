package classes;

import abstractions.Shape;

import java.util.List;

public class Operator {
    public void giveInfo(Shape shape){
        System.out.println(shape.toString());
    }

    public void listInfo(List<? extends Shape> shapes){
        for(Shape shape : shapes){
            System.out.println(shape.toString());
        }
    }
}
