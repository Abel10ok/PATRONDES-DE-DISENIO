package strategy_02;

public class Test {

    public static void main(String[] args) {
        SuperChofer chofer = new SuperChofer();

        Auto auto = new Auto();
        Moto moto = new Moto();
        Camion camion = new Camion();

        chofer.setVehiculo(auto);
        chofer.acelerar();
        chofer.setVehiculo(moto);
        chofer.frenar();
        chofer.setVehiculo(camion);
        chofer.acelerar();


    }
}
