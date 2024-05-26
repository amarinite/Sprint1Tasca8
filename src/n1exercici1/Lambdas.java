package n1exercici1;

import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<String> musicGenres = Arrays.asList("jazz", "funk", "hip-hop", "pop", "soul", "rock", "opera");
        List<String> musicWithO = musicGenres.stream().filter(list -> list.contains("o")).toList();

        System.out.println("Music genres with 'o':");
        for (String genre : musicWithO) {
            System.out.println(genre);
        }
    }
}