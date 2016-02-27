package com.namazed;

import com.namazed.comparator.ComparatorPersonsAge;
import com.namazed.comparator.ComparatorPersonsFirstName;
import com.namazed.comparator.ComparatorPersonsLastName;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static final String FILE_PATH = "Users.txt";
    public static ArrayList<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Persons loading...");
        loadingPersons();
        System.out.println("Persons were loaded.\n" +
                "App was started. Enter '--stop' to exit.\n" +
                "Enter one of these commands '-f' '-l' '-a'...");
        scanCommands();
    }

    private static void scanCommands() {
        try (Scanner scanner = new Scanner(System.in)) {
           out: while (true) {
                String line = scanner.next();
                switch (line) {
                    case "-f":
                        //sort ArrayList (personList) by FirstName
                        Collections.sort(personList, new ComparatorPersonsFirstName());
                        outputPersonList();
                        break;
                    case "-l":
                        //sort ArrayList (personList) by LastName
                        Collections.sort(personList, new ComparatorPersonsLastName());
                        outputPersonList();
                        break;
                    case "-a":
                        //sort ArrayList (personList) by Age
                        Collections.sort(personList, new ComparatorPersonsAge());
                        outputPersonList();
                        break;
                    case "--stop":
                        System.out.println("App was stopped");
                        break out;
                    default:
                        System.out.println("Unknown command.\n" +
                                "Enter one of these commands '-f' '-l' '-a'...");
                        break;
                }
            }

        }
    }

    private static void loadingPersons() {
        try (FileInputStream fileIntputStream = new FileInputStream(FILE_PATH);
             InputStreamReader inputStreamReader = new InputStreamReader(fileIntputStream, "UTF-8");
             BufferedReader reader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineSplit = line.split(" ");
                personList.add(new Person(lineSplit[0], lineSplit[1], Integer.parseInt(lineSplit[2])));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void outputPersonList() {
        for (Person person : personList) {  // Output list, after sort
            System.out.println(person.toString());
        }
        System.out.println("Enter one of these commands '-f' '-l' '-a'...");
    }


}
