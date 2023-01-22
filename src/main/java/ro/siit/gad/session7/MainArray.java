package ro.siit.gad.session7;

import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {
        Person [] persons = new Person[3];
        persons[1] = new Person("Ion");
        persons[2] = new Unemployed("Pavel");
        persons[0] = new Employed("Ritchie");
        persons[4] = new Person("Bill");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        for (Person person: persons) {
            System.out.println(person);
        }

        Arrays.stream(persons).forEach(Person::toString);
    }
}
