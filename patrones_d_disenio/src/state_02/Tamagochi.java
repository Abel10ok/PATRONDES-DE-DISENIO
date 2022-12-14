package state_02;

public class Tamagochi {
    private TamagochiState estadoActual;
    public Tamagochi() {
        estadoActual = new Feliz();
    }
    public void darDeComer(){
        estadoActual = estadoActual.comer();
    }
    public void darDeBeber(){
        estadoActual = estadoActual.beber();
    }
    public void darMimos(){
        estadoActual = estadoActual.mimos();
    }

    public TamagochiState getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(TamagochiState estadoActual) {
        this.estadoActual = estadoActual;
    }
}
