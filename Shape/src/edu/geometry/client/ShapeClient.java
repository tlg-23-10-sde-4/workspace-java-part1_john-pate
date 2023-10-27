package edu.geometry.client;

import edu.geometry.Rectangle;
import edu.geometry.Shape;

class ShapeClient {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.setDimension1(6);
        rec.setDimension2(5);
        System.out.println(rec.getArea());
    }

}