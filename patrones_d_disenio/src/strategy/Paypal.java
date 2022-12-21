package strategy;

public class Paypal implements StrategyPago{
    private String email;
    private String clave;

    public Paypal(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }

    @Override
    public void pago() {
        System.out.println("pago con paypal");
    }
}
