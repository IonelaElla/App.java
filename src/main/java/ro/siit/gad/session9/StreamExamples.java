package ro.siit.gad.session9;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamExamples {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3,4 ,5);
        IntStream intStream1 = IntStream.rangeClosed(1, 10);

        Supplier<IntStream> rangeSupplier = () -> IntStream.rangeClosed(1, 10);

        rangeSupplier.get().forEach(System.out::println);

        int sum = rangeSupplier.get().reduce(0, (n1, n2) -> n1+n2);
        System.out.println(sum);
    }
}
