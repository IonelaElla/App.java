package ro.siit.gad.session9;

import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .filter(nr -> isPrime(nr))
                .forEach(System.out::println);
    }

    public static boolean isPrime(int nr){
        for (int i = 2; i < Math.sqrt(nr); i++) {
            if (nr % i == 0){
                return false;
            }
        }
        return true;
    }

}
