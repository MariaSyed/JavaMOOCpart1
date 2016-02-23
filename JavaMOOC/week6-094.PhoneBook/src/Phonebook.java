/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
import java.util.ArrayList;

public class Phonebook {

    private final ArrayList<Person> phonebook;

    public Phonebook() {
        this.phonebook = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.phonebook.add(person);
    }

    public void printAll() {
        for (Person person : this.phonebook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String toSearch) {
        for (Person person : this.phonebook) {
            if (person.getName().contains(toSearch)) {
                System.out.println(person.getName());
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
