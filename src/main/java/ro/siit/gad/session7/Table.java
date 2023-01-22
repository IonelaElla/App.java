package ro.siit.gad.session7;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Table implements Comparable<Table>{
    private int width;
    private int length;
    private int height;

    public Table(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return width == table.width && length == table.length && height == table.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, height);
    }

    @Override
    public String toString() {
        return "" + width + "-" + length + "-" + height;
    }


    @Override
    public int compareTo(@NotNull Table o) {
        return length - o.length;
    }

    public int getHeight() {
        return height;
    }
}
