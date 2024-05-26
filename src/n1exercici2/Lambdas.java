package n1exercici2;

import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<String> musicGenres = Arrays.asList("jazz", "funk", "hip-hop", "pop", "soul", "rock&roll", "opera");
        List<String> musicWithO = musicGenres.stream().filter(list -> list.contains("o"))
                .filter(list -> list.length() > 5).toList();

        System.out.println("Music genres with 'o' and more than 5 letters:");
        for (String genre : musicWithO) {
            System.out.println(genre);
        }
    }
}