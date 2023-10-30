package edu.geometry;

public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double angle;

    public Triangle (double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    public double area () {
        return ((getSide1() * getSide2()) * Math.sin(getAngle())) / 2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getAngle() {
        return angle * (Math.PI/180);
    }
}