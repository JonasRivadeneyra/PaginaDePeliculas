package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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




        ArrayList<Titulo> lista = new ArrayList<>();
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

    }
}
