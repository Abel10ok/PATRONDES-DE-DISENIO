package observer_04;

public class Vuelos {
    private String origen;
    private String destino;
    private String fecha;

    public Vuelos(String origen, String destino, String fecha) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Vuelos{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
