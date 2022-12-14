package state_02;

public class Feliz implements TamagochiState{
    @Override
    public TamagochiState comer() {
        System.out.println("estoy sediento");
        return new Sediento();
    }
    @Override
    public TamagochiState beber() {
        System.out.println("estoy hambriento");
        return new Hambriento();
    }
    @Override
    public TamagochiState mimos() {
        return this;
    }
}
