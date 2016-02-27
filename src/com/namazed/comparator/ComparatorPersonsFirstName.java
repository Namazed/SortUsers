package com.namazed.comparator;

import com.namazed.Person;
import java.util.Comparator;

/**
 * Created by Namazed.
 */
public class ComparatorPersonsFirstName implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
