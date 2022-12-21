package strategy;

public class Tarjeta implements StrategyPago{
    private String titular;
    private String numero;
    private String verificador;
    private String vence;

    public Tarjeta(String titular, String numero, String verificador, String vence) {
        this.titular = titular;
        this.numero = numero;
        this.verificador = verificador;
        this.vence = vence;
    }

    @Override
    public void pago() {
        System.out.println("pagado con tarjeta");
    }
}
