package com.tick;

/*
 * Class definition to model the working of an alarm clock.
 * This is called a "business class" or "system class," as it contains
 * business things (attributes and methods).
 * This class definition does NOT have a main() method (and many do not).
 */
class AlarmClock {
    // These are shared (static) variables - only one copy of these, live in the class-wide common area
    public static final int MIN_INTERVAL = 1;     // a way to set client/business requirements once, recursively
    public static final int MAX_INTERVAL = 20;
    private static int nextId = 1;

    // Properties or attributes - in Java, we call these "instance variables" or "fields"
    // business constraint: must be between 1 and 20 (inclusive)
    private int id;
    private int snoozeInterval = 5; // This sets the default snoozeInterval for all com.tick.AlarmClock instances, unless specified (instead of 0)

    // constructors - these get called when the client says "new"
    public AlarmClock() {
        // no-op
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);  // delegate to setter for any validation/conversion
        this.id = nextId++;     //no setter provided, assign directly
    }

    // Functions of operations - in Java, we call these "methods"
    void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }

    // Accessor methods - provide "controlled" access to the object's fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // enforce the data constraint (if-else) -> must be between 1 and 20 (inclusive).
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval<= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". " +
                    "Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
        }
    }

    public String toString() {
       return "com.tick.AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }
}