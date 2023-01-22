package ro.siit.gad.session6;

import java.util.ArrayList;
import java.util.List;

public class MainWithEnum {
    public static void main(String[] args) {
        List<PersonWithEnum> persons = new ArrayList<>();
        persons.add(new PersonWithEnum("Ion Popovici", Salutation.MR, PersonWithEnum.Nationality.ROMANIAN));
        persons.add(new PersonWithEnum("Angela Buhnareanu", Salutation.MRS, PersonWithEnum.Nationality.ROMANIAN));
        persons.add(new PersonWithEnum("Leopold Williams", Salutation.MR, PersonWithEnum.Nationality.ENGLISH));

        for (PersonWithEnum person: persons) {
            if(person.getNationality().equals(PersonWithEnum.Nationality.ROMANIAN)){
                System.out.println(person);
            }
        }

        String romanian = "ROMANIAN";
        System.out.println(PersonWithEnum.Nationality.valueOf(romanian));

        System.out.println(PersonWithEnum.Nationality.ENGLISH.name());
    }
}
