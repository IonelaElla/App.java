package ro.siit.gad.session9;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LazyStreams {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Donald Duck", 9.23));
        students.add(new Student("Mickey Mouse", 7.28));
        students.add(new Student("Bugs Bunny", 9.99));

        students.stream()
                .filter(student -> student.getName().startsWith("B"))
                .sorted(Comparator.comparing(Student::getGrade))
                .map(student -> student.increaseGrade())
                .forEach(System.out::println);

        students.forEach(System.out::println);
    }
}
