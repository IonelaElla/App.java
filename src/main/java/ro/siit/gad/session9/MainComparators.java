package ro.siit.gad.session9;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainComparators {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Donald Duck", 9.23));
        students.add(new Student("Mickey Mouse", 7.28));
        students.add(new Student("Bugs Bunny", 9.99));

        for (Student student:
             students) {
            System.out.println(student);
        }

//        Set<Student> gradeOrderedStudents = new TreeSet<>(new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getGrade().compareTo(o2.getGrade());
//            }
//        });

//        Set<Student> gradeOrderedStudents = new TreeSet<>((o1, o2) -> o1.getGrade().compareTo(o2.getGrade()));

        Set<Student> gradeOrderedStudents = new TreeSet<>(Comparator.comparing(Student::getGrade));
        gradeOrderedStudents.addAll(students);
//        for (Student student:
//                gradeOrderedStudents) {
//            System.out.println(student);
//        }

        gradeOrderedStudents.forEach(System.out::println);

        Stream<Student> stStr = gradeOrderedStudents.stream();

        //gradeOrderedStudents.stream()
        stStr
                .filter(student -> student.getGrade() > 9)
                .sorted()
                //.filter(student -> student.getName().startsWith("D"))
                .forEach(System.err::println);

        // stStr.sorted();


    }
}
