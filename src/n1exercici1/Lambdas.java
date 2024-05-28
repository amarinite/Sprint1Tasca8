package n1exercici1;

import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<String> musicGenres = Arrays.asList("jazz", "funk", "hip-hop", "pop", "soul", "rock", "opera");

        musicGenres.stream().filter(list -> list.toLowerCase().contains("o")).forEach(System.out::println);
    }
}