public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;


    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duracionEnMinutos=" + duracionEnMinutos +
                ", incluidoEnElPlan=" + incluidoEnElPlan +
                '}';
    }
}
