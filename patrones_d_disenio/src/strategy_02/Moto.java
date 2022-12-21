package strategy_02;

public class Moto implements  StrategyChofer{
    @Override
    public void acelerar() {
        System.out.println("acelerar moto");
    }

    @Override
    public void frenar() {
        System.out.println("frenar moto");
    }
}
