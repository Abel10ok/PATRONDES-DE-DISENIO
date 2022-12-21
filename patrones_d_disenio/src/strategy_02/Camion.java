package strategy_02;

public class Camion implements StrategyChofer{
    @Override
    public void acelerar() {
        System.out.println("acelerar camion");
    }

    @Override
    public void frenar() {
        System.out.println("frenar camion");
    }
}
