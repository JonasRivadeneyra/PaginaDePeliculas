import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

            Pelicula miPelicula = new Pelicula();
            miPelicula.setNombre("Encanto");
            miPelicula.setFechaDeLanzamiento(2021);
            miPelicula.setDuracionEnMinutos(120);
            miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(6);
        miPelicula.evalua(10);


        System.out.println("**********************************************");
        System.out.println("Fue evaluada : " + miPelicula.getTotalDeLasEvaluaciones() + (miPelicula.getTotalDeLasEvaluaciones() == 1 ? " vez" : " veces"));
        System.out.println("Obtuvo una nota  media de  : " + miPelicula.calculaMedia());
       //Creando Series

            Serie casaDragon = new Serie();
            casaDragon.setNombre("La casa del dragon");
            casaDragon.setFechaDeLanzamiento(2022);
            casaDragon.setTemporadas(1);
            casaDragon.setMinutosPorEpisodio(50);
            casaDragon.setEpisodiosPorTemporada(10);
            casaDragon.muestraFichaTecnica();
            System.out.println(casaDragon.getDuracionEnMinutos());

            Pelicula otraPelicula = new Pelicula();
            otraPelicula.setNombre("Matrix");
            otraPelicula.setFechaDeLanzamiento(1998);
            otraPelicula.setDuracionEnMinutos(180);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos "+calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("la casa targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalDeLasEvaluaciones(50);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula();
        peliculaDeBruno.setNombre("El señor de los anillos");
        peliculaDeBruno.setDuracionEnMinutos(180);
        peliculaDeBruno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        System.out.println("Tamaño de lista de peliculas:" + listaDePeliculas.size());
        System.out.println("la primera pelicula es " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);

    }
}
