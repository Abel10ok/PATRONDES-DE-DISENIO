package strategy_02;

public class SuperChofer {
    private StrategyChofer vehiculo;

    public SuperChofer(){
    }

    public void setVehiculo(StrategyChofer vehiculo){
        this.vehiculo = vehiculo;
    }

    public void acelerar(){
        vehiculo.acelerar();
    }

    public void frenar(){
        vehiculo.frenar();
    }
}
