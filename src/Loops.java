import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double promedio = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Evaluacion de la pelicula ? (0-10)");
            nota = teclado.nextDouble();
            promedio = promedio + nota;

        }
        System.out.println("El promedio de la pelicula es " + promedio / 3);
    }
}
