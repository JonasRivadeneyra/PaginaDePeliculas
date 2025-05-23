package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;

    //CONSTRUCTORES

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    //GETTERS Y SETTERS

    @Override
    public int getDuracionEnMinutos() {
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "serie: " +this.getNombre() +"(" +this.getFechaDeLanzamiento() +")";
    }
}
