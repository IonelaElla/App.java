package ro.siit.gad.session7;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        persons.add(new Person("Ion"));
        persons.add(new Person("Ana"));
        persons.add(new Person("Ion"));

        System.out.println(persons.size());
        persons.forEach(System.out::println);
    }
}
