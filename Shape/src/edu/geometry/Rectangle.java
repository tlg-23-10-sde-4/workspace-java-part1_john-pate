package edu.geometry;

public class Rectangle extends Shape {
    private double dimension1;  // TODO: change titles
    private double dimension2;  // TODO: change to imutible

    public Rectangle() {
    }

    public Rectangle(String name, double dimension1, double dimension2) {
        super(name);                // TODO: remove and rely on polymorphism
        setDimension1(dimension1);
        setDimension2(dimension2);
    }

    public Object getArea() {       // TODO: adjust
        return dimension1 * dimension2;
    }

    @Override
    public double getDimension1(int i) {
        return dimension1;
    }

    public void setDimension1(double dimension1) {
        this.dimension1 = dimension1;
    }

    @Override
    public double getDimension2(int i) {
        return dimension2;
    }

    public void setDimension2(double dimension2) {
        this.dimension2 = dimension2;
    }

}