public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a Screen Match");
        System.out.println("Pelicula : Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElplan= true;
        String sinopsis = "\n"+"\n" + """
                          Accion aventura de ciencia ficcion, donde un programador descubre que el mundo es una simulacion creada por maquinas.
                          El programa Matrix es un sistema de control mental que mantiene a los humanos en un estado de ignorancia.
                          Neo, el protagonista, se une a un grupo de rebeldes para luchar contra las maquinas y descubrir la verdad sobre su realidad.
                          
                          """ + "Fecha de lanzamiento: " + fechaDeLanzamiento + "\n";

        double calificacion = 8.7 ;
        double media = (8.2 + 6.8 + 9.0) / 3;
        int clasificacion = (int) (media / 2);


        System.out.println("calificacion: " + calificacion);
        System.out.println("Clasificacion: " + clasificacion);
        System.out.println("Sinopsis: " + sinopsis);


        if (incluidoEnElplan == true) {
            System.out.println("Incluido en el plan");
        }
        else {
            System.out.println("No incluido en el plan");

        }
    }
}