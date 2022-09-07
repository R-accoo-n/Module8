package classes;

import abstractions.Shape;

public class Circle implements Shape {
    private static final String INFO = "classes.Circle";


    @Override
    public String toString(){
        return Circle.INFO;
    }

}
