package strategy_04;

public class Caminando implements strategyMovimiento{

    @Override
    public void calcularTiempo(double distancia) {
        System.out.println("tiempo caminando: "+ distancia / 0.20366*13);
    }
}
