package com.namazed;

/**
 * Created by Namazed on 27.02.2016.
 */
public class Person {
    String firstName;
    String lastName;
    int age;

    Person(String n, String lN, int a) {
        firstName = n;
        lastName = lN;
        age = a;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + " " + age;
    }
}
