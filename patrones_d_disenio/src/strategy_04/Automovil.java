package strategy_04;

public class Automovil implements  strategyMovimiento{

    @Override
    public void calcularTiempo(double distancia) {
        System.out.println("tiempo en auto: "+ distancia/ 0.40366 * 4);
    }
}
