package Ejercicio1.builders;

import Ejercicio1.builders.Constructor;

public class ConstructorBase implements Constructor {

    private String nombre;
    private int numeroAmbulancias;
    private double tiempoMediaAsistencia;


    @Override
    public void setNombreBase(String nombre) {

    }

    @Override
    public void setNumeroAmbulancia(int numeroAmbulancias) {

    }

    @Override
    public void setTiempoMediaAsistencia(double tiempoMediaAsistencia) {

    }

    public Base getResult() {
        return new Base(nombre, numeroAmbulancias, tiempoMediaAsistencia);
    }
}
