package state_03;

import java.sql.SQLOutput;

public class Verde implements StateSemaforo{

    private Semaforo v;

    public Verde(Semaforo v){
        this.v = v;
    }

    @Override
    public void mostrarAviso() {
        System.out.println(v.getEstado());

    }

    @Override
    public void cambiarEstado() {
        v.setEstado(new Amarillo(v));
    }
}

