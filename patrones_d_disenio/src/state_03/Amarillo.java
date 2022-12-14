package state_03;

public class Amarillo implements  StateSemaforo{

    private Semaforo v;
    public Amarillo(Semaforo v) {
        this.v = v;
    }


    @Override
    public void mostrarAviso() {
        System.out.println(v.getEstado());
    }

    @Override
    public void cambiarEstado() {
        v.setEstado(new Rojo(v));
    }
}
