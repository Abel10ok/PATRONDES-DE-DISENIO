package state_02;

public class Sediento implements TamagochiState{
    @Override
    public TamagochiState comer(){
        System.out.println("estoy triste");
        return new Triste();
    }
    @Override
    public TamagochiState beber() {
        System.out.println("estoy feliz");
        return new Feliz();
    }
    @Override
    public TamagochiState mimos() {
        System.out.println("mmmm");
        return this;
    }
}
