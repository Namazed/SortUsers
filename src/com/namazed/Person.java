package com.namazed;

/**
 * Created by Namazed on 27.02.2016.
 */
public class Person {
    String name;
    String lastName;
    int age;

    Person(String n, String lN, int a) {
        name = n;
        lastName = lN;
        age = a;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
