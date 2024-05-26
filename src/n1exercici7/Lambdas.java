package n1exercici7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<Object> stuff = Arrays.asList(52637, "mountain gates", 32, "Can you pass me that?", 234.45, "okay");

        stuff.sort(Comparator.comparing(thing -> thing.toString().length()).reversed());

        stuff.forEach(System.out::println);
    }
}