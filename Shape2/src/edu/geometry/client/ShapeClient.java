package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

class ShapeClient {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Circle(3.2);
        System.out.println();
        shapes[2] = new Rectangle(2.0, 3.0);
        shapes[3] = new Rectangle(2.0, 4.0);
        System.out.println();
        shapes[4] = new Triangle(5.0, 5.0, 30.0);
        shapes[5] = new Triangle(5.0, 6.0, 42.0);

        for (Shape shape : shapes) {
            System.out.printf("The area of the %s is %s\n", shape.getClass().getSimpleName(), shape.area());
        }
    }
}