package strategy_04;

public class Bicicleta implements strategyMovimiento{
    @Override
    public void calcularTiempo(double distancia) {
        System.out.println("tiempo en bicileta: "+ distancia/0.050366 * 1.5);
    }
}
