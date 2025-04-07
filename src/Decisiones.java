public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        String plan = "Plus";
        double calificacion = 8.7;

        if (fechaDeLanzamiento >= 2022){
            System.out.println("La película es reciente");
        }
        else {
            System.out.println("Peliculas retro");
        }

        if (incluidoEnElPlan && plan.equals("Plus")) {
            System.out.println("Disfrute su película");
        } else {
            System.out.println("Contenido no disponible");
        }
    }

}
