package org.human;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("JP", LocalDate.of(1990, 05, 16));

        System.out.printf("%s is %s years old\n", p1.getName(), p1.getAge());
    }

}