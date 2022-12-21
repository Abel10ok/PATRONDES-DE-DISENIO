package strategy_02;

public class Auto implements StrategyChofer{

    @Override
    public void acelerar() {
        System.out.println("acelerar auto");
    }

    @Override
    public void frenar() {
        System.out.println("frenar auto");
    }
}
