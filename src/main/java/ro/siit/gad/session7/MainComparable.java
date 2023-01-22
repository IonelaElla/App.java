package ro.siit.gad.session7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparable {
    public static void main(String[] args) {
        List<Table> tables = new ArrayList<>();
        tables.add(new Table(2, 3 , 4));
        tables.add(new Table(4, 1, 9));
        tables.add(new Table(3, 3 ,5 ));

        tables.forEach(System.out::println);

        System.out.println("-----");
        Collections.sort(tables);
        tables.forEach(System.out::println);

        System.out.println("-----");
        Collections.sort(tables, new TableHeightComparator());
        tables.forEach(System.out::println);
    }
}
