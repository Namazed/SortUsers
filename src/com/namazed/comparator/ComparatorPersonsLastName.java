package com.namazed.comparator;

import com.namazed.Person;

import java.util.Comparator;

/**
 * Created by Namazed on 27.02.2016.
 */
public class ComparatorPersonsLastName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
