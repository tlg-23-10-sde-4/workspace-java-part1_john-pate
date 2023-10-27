package edu.geometry;

public abstract class Shape {
    // fields
    private String name;
    private double dimension1;
    private double dimension2;

    // constructors
    public Shape () {
        super();    // unnecessary to call
    }

    public Shape(String name) {
        setName(name);
    }
    public Shape(String name, double dimension1) {
        this.name = name;
        setDimension1(dimension1);
    }

    public Shape(String name, double dimension1, double dimension2) {
        this.name = name;
        this.dimension1 = dimension1;
        setDimension2(dimension2);
    }

    // business methods
    public abstract Object getArea();

    // accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDimension1() {
        return dimension1;
    }

    public double setDimension1(double dimension1) {
        this.dimension1 = dimension1;
    }

    public double getDimension2() {
        return dimension2;
    }

    public double setDimension2(double dimension2) {
        this.dimension2 = dimension2;
    }

    @Override
    public String toString() {
        return getClass().getName() + "name: " + getName() + "dimension1: " + getDimension1() + "dimension2: " +
                getDimension2();
    }

    public abstract double getDimension1(int i);

    public abstract double getDimension2(int i);
}

