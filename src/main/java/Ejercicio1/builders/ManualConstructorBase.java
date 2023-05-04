package Ejercicio1.builders;

import Ejercicio1.builders.Constructor;

public class ManualConstructorBase {
    public class CarManualBuilder implements Constructor {
        private String nombre;
        private int numeroAmbulancias;
        private double tiempoMediaAsistencia;

        @Override
        public void setNombreBase(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public void setNumeroAmbulancia(int numeroAmbulancias) {
            this.numeroAmbulancias = numeroAmbulancias;
        }

        @Override
        public void setTiempoMediaAsistencia(double tiempoMediaAsistencia) {
            this.tiempoMediaAsistencia = tiempoMediaAsistencia;
        }

        public Manual getResult() {
            return new Manual(nombre, numeroAmbulancias, tiempoMediaAsistencia);
        }
    }
}
