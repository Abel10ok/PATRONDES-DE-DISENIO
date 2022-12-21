package strategy;

public class Bitcoin implements  StrategyPago{
    private String billetera;

    public Bitcoin(String billetera){
        this.billetera = billetera;
    }

    @Override
    public void pago() {
        System.out.println("pago con bitcoin");
    }
}
