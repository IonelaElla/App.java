package ro.siit.gad.session6;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class PersonWithEnum {
    private String name;
    private Salutation salutation;
    private Nationality nationality;

    public static enum Nationality {
        ROMANIAN("roman"), ENGLISH("englez");

        private String prop;

        Nationality(String prop){
            this.prop = prop;
        }

        @Override
        public String toString() {
            return this.prop;
        }
    }


    public PersonWithEnum(String name, Salutation salutation, Nationality nationality) {
        this.name = name;
        this.salutation = salutation;
        this.nationality = nationality;
    }

    public Nationality getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return salutation + " " + name + " (" + nationality + ")" ;
    }
}
