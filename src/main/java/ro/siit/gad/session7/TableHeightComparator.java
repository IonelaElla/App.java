package ro.siit.gad.session7;

import java.util.Comparator;

public class TableHeightComparator implements Comparator<Table> {
    @Override
    public int compare(Table o1, Table o2) {
        return o1.getHeight() - o2.getHeight();
    }
}
