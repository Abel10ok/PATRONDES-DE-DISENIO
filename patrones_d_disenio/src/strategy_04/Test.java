package strategy_04;

public class Test {
    public static void main(String[] args) {

        Punto punto = new Punto(2.0,2.0);
        Punto punto2 = new Punto(4.0,4.0);

        Mapa mapa = new Mapa("bicicleta",punto, punto2 );

        mapa.calcularTiempo();

    }
}
