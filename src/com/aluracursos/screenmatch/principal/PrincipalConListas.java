package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;


public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Serie casaDragon = new Serie("La casa del dragon",2022);
        casaDragon.evalua(3);
        Pelicula otraPelicula = new Pelicula("Matrix",1998);
        otraPelicula.evalua(5);
        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
        peliculaDeBruno.evalua(10);


        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>2) {
                System.out.println(pelicula.getClasificacion());
            }

        }
        System.out.println("**********************************************");
        ArrayList<String> listaDeActores = new ArrayList<>();
        listaDeActores.add("Penelope cruz");
        listaDeActores.add("Antonio Banderas");
        listaDeActores.add("Ricardo Darin");
        System.out.println("no ordenada" + listaDeActores);
        System.out.println("***********************************************");

        Collections.sort(listaDeActores);
        System.out.println("lista de artistas ordenada " + listaDeActores);

        Collections.sort(lista);
        System.out.println("lista de titulos ordenada " + lista);
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista ordenada por fecha " +lista);

    }
}
