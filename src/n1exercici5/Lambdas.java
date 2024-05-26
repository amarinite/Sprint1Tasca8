package n1exercici5;

public class Lambdas {
    public static void main(String[] args) {
        PiValue pi = () -> 3.14159f;

        System.out.println("Pi value: " + pi.getPiValue());
    }
}