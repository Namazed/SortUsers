package com.namazed;

/**
 * Created by Namazed.
 */
public class Person {
    String firstName;
    String lastName;
    int age;

    Person(String fN, String lN, int a) {
        firstName = fN;
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
