public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;
        //print ficha tecnica
        miPelicula.muestraFinchaTecnica();

        miPelicula.evalua(10.0);
        miPelicula.evalua(10.0);

        //print
        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalDeLasEvaluaciones);

        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

        otraPelicula.muestraFinchaTecnica();
        otraPelicula.evalua(9.0);
        otraPelicula.evalua(8.0);

        System.out.println(otraPelicula.sumaDeLasEvaluaciones);
        System.out.println(otraPelicula.totalDeLasEvaluaciones);
        System.out.println(otraPelicula.calculaMedia());

    }
}
