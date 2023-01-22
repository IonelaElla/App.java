package ro.siit.gad.session6;


public class Person {
    private String name;
    private String salutation;

    public Person(String name, String salutation) {
        this.name = name;
        this.salutation = salutation;
    }

    public String getSalutation() {
        return salutation;
    }

    @Override
    public String toString() {
        return salutation + " " + name;
    }
}
