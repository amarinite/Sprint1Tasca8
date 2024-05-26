package n1exercici8;

public class Lambdas {
    public static void main(String[] args) {
        Reverse wordReverse = (text) -> new StringBuilder(text).reverse().toString();

        System.out.println(wordReverse.reverse("led zeppelin"));
    }
}
