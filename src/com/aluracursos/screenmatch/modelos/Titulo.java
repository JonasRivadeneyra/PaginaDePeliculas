package com.aluracursos.screenmatch.modelos;




public class Titulo {



    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones ;
    private int totalDeLasEvaluaciones;

    //CONSTRUCTORES

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }



    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }


    //getters

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }
    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

//**metodos

    public void muestraFichaTecnica (){
        System.out.println("\nEl nombre de la pelicula es: " + nombre );
        System.out.println("Su Fecha de lanzamiento es : " + fechaDeLanzamiento);
        System.out.println("Su Duracion es : " + getDuracionEnMinutos() + " minutos");
        System.out.println(incluidoEnElPlan ? "Pelicula incluida en tu plan  " : "no disponible para tu plan " );
    }


    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }


    public double calculaMedia (){
        return sumaDeLasEvaluaciones/totalDeLasEvaluaciones;
    }
}
