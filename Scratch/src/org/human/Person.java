package org.human;

import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class. More accurately, a class definition written in such a way that
 * instances of it, once created, cannot have their properties changed.
 * There are simply no public methods to do so.
 */
class Person {
    private final String name;
    private final LocalDate birthDate;

    // private file birthCertificate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns the person's age in whole years.
     *  This is a "derived property", i.e. it is calculated and returned, not stored in a field.
     *
     */

    public int getAge() {
        return Period.between(getBirthday(), LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", getName(), getBirthday());
    }

}