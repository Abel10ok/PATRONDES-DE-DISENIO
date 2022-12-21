package strategy_04;

import strategy_03.MoverCaballo;
import strategy_03.MoverPeon;

public class Punto {
    private double latitud;
    private double longitud;


    public Punto(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double distanciaEntrePuntos(Punto punto){
        double distancia = Math.abs(latitud - punto.latitud)+ Math.abs(longitud - punto.longitud);
        return distancia;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
