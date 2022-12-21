package strategy;

public class Test {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Paypal pagoPaypal = new Paypal("abel@gmail", "123");
        Bitcoin pagoBitcoin = new Bitcoin("102030");
        Tarjeta pagoTarjeta = new Tarjeta("cielo","1234","10","2030");

        tienda.setPago(pagoBitcoin);
        tienda.pago();
        tienda.setPago(pagoPaypal);
        tienda.pago();
        tienda.setPago(pagoTarjeta);
        tienda.pago();


    }
}
