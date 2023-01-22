package ro.siit.gad.session7;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class Person {
    private String name;

    public Person (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
