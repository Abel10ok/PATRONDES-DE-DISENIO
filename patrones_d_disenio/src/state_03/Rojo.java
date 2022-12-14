package state_03;

public class Rojo implements StateSemaforo{

    private Semaforo v;
    public Rojo(Semaforo v) {
        this.v = v;
    }

    @Override
    public void mostrarAviso() {
        System.out.println(v.getEstado());
    }

    @Override
    public void cambiarEstado() {
        v.setEstado(new Verde(v));
    }
}
