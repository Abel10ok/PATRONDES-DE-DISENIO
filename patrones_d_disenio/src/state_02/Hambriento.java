package state_02;

public class Hambriento implements TamagochiState{
    @Override
    public TamagochiState comer() {
        System.out.println("estoy feliz");
        return new Feliz();
    }
    @Override
    public TamagochiState beber() {
        System.out.println("estoy triste");

        return new Triste();
    }
    @Override
    public TamagochiState mimos() {
        return this;
    }
}
