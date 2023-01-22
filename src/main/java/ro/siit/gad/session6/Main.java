package ro.siit.gad.session6;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[6];
        persons[0] = new Person("John Doe", "MR");
        persons[1] = new Person("Michael Smith", "Mr.");
        persons[2] = new Person("Vanessa Anderson", "Mrs.");
        persons[3] = new Person("Patrick Defoe", "MR.");
        persons[4] = new Person("Winona Rider", "Ms.");
        persons[5] = new Person("Simone Duffy", "MRS");

        for (Person person: persons) {
            System.out.println(person);
        }

        System.out.println("=============");
        for (Person person: persons) {
            if(person.getSalutation().equals("MR") ||
                    person.getSalutation().equals("Mr.") ||
                    person.getSalutation().equals("MR.")) {
                System.out.println(person);
            }
        }

        // mister John
        // TUE <-> Tuesday <-> Tue

    }
}
