package strategy_04;

public class Mapa {

    private String movilidad;

    private Punto punto;
    private Punto punto2;
    private strategyMovimiento strategy;

    public Mapa(String movilidad,Punto punto, Punto punto2)
    {
        this.punto = punto;
        this.punto2 = punto2;
        this.movilidad = movilidad;
        if(movilidad.equals("automovil"))
            strategy = new Automovil();
        if(movilidad.equals("bicicleta"))
            strategy = new Bicicleta();
        if(movilidad.equals("caminando"))
            strategy = new Caminando();
    }

    public void calcularTiempo(){
        double distancia = punto.distanciaEntrePuntos(punto2);
        strategy.calcularTiempo(distancia);
    }

}
