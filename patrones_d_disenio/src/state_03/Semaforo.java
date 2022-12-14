package state_03;

public class Semaforo {

    private StateSemaforo estado;

    public Semaforo()
    {
        this.setEstado(new Verde(this));
    }


    public void mostrarAviso(){
        getEstado().mostrarAviso();
    }

    public void cambiarEstado(){
        getEstado().cambiarEstado();
    }

    public StateSemaforo getEstado() {
        return estado;
    }

    public void setEstado(StateSemaforo estado) {
        this.estado = estado;
    }
}
