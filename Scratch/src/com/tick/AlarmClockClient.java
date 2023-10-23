package com.tick;

/*
 * This is the application main-class, i.e., the class definition with the main() method.
 * Its purpose is to create a few instances of com.tick.AlarmClock and give them a basic test drive.
 * A client is any piece of code that runs code operating on an object -- Making the call
 */
class AlarmClockClient {

    // This is the application "entry point" or starting point
    public static void main(String[] args) {
        // Create an instance of com.tick.AlarmClock and set its properties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        // Create a 2nd instance of com.tick.AlarmClock and set its properties also
        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL);    //as long as it can
        //clock2.setSnoozeInterval(10);

        // Create a 3rd instance of com.tick.AlarmClock object, but DON'T set its properties - so what will they be?
        AlarmClock clock3 = new AlarmClock();

        // Call methods on instances of com.tick.AlarmClock
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println();

        // show their toString() methods in action
        System.out.println(clock1.toString());
        System.out.println(clock2);         // calling an object automatically calls toString()
        System.out.println(clock3.toString());
    }
}