import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es tu pelicula favorita ?");
        String pelicula = teclado.nextLine();
        System.out.println("Cual es tu año de lanzamiento ?");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Evaluacion de la pelicula ?");
        double nota = teclado.nextDouble();

        System.out.println("Tu pelicula favorita es " + pelicula);
        System.out.println("El año de lanzamiento es " + fechaDeLanzamiento);
        System.out.println("Tu evaluacion es " + nota);

    }
}
