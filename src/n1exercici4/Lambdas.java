package n1exercici4;

import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<String> months = Arrays.asList("january", "february", "march", "april", "mayo", "june",
                "july", "august", "september", "october", "november", "december");

        months.forEach(System.out::println);
    }
}