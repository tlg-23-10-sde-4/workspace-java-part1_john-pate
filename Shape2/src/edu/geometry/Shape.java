package edu.geometry;

public interface Shape {

    public default double area() {
        return 0;
    }
}
