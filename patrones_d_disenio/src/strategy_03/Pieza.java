package strategy_03;

public class Pieza {
    private String nombre;
    private StrategyMovimiento estrategia;

    public Pieza(String nombre)
    {

        this.nombre = nombre;
        if(nombre.equals("peon"))
            estrategia = new MoverPeon();
        if(nombre.equals("caballo"))
            estrategia = new MoverCaballo();
    }

    public void mover(){
        estrategia.mover();
    }
}
