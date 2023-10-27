package edu.geometry;

public class Circle extends Shape {
    private double radius;

    @Override
    public Object getArea() {
        return null;
    }
    @Override
    public double getDimension1() {
        getRadius();
    }

    @Override
    public double getDimension1(int i) {
        return 0;
    }

    @Override
    public double getDimension2(int i) {
        return 0;
    }

}