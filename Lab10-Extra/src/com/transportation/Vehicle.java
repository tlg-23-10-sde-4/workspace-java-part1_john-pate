package com.transportation;

public abstract class Vehicle {
    // INSTANCE VARIABLES
    private String vin;

    // CONSTRUCTORS
    public Vehicle(String vin) {
        this.vin = vin;
    }

    // BUSINESS METHODS -- subclasses have the option to throw an exception, not the obligation
    public abstract void moveTo(String location) throws DestinationUnreachableException;

    // ACCESSOR METHODS
    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": vin=" + getVin();
    }
}