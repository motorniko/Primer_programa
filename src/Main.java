public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;

        String sinopsis = "\n\n" +
                "Acción, aventura de ciencia ficción, donde un programador descubre que el mundo es una simulación creada por máquinas.\n" +
                "El programa Matrix es un sistema de control mental que mantiene a los humanos en un estado de ignorancia.\n" +
                "Neo, el protagonista, se une a un grupo de rebeldes para luchar contra las máquinas y descubrir la verdad sobre su realidad.\n" +
                "Fecha de lanzamiento: " + fechaDeLanzamiento + "\n";

        double calificacion = 8.7;
        double promedio = (8.2 + 6.8 + 9.0) / 3;
        int clasificacion = (int) (promedio / 2);

        System.out.println("Calificación: " + calificacion);
        System.out.println("Clasificación: " + clasificacion);
        System.out.println("Sinopsis: " + sinopsis);

        if (incluidoEnElPlan) {
            System.out.println("Incluido en el plan");
        } else {
            System.out.println("No incluido en el plan");
        }
    }
}
