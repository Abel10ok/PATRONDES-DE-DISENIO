package state_02;

public class Triste implements TamagochiState{
    @Override
    public TamagochiState comer() {
        return this;
    }
    @Override
    public TamagochiState beber() {
        return this;
    }
    @Override
    public TamagochiState mimos() {
        System.out.println("estoy feliz");
        return new Feliz();
    }
}
